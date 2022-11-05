package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;


class CalculatorTest {

    @DisplayName("정상 계산 테스트")
    @Test
    public void 계산기_테스트() {
        Calculator calculator = new Calculator(new Expression("3 + 5 * 4"));
        assertThat(calculator.calculate()).isEqualTo(32);
    }

    @DisplayName("0으로 나눌 경우 오류테스트")
    @Test
    public void 나누기_0테스트() {
        assertThatIllegalArgumentException().isThrownBy(() -> {
            Calculator calculator = new Calculator(new Expression("3 / 0"));
            assertThat(calculator.calculate()).isEqualTo(1);
        });
    }

    @DisplayName("입력값이 null 이거나 공백 오류테스트")
    @Test
    public void 입력_null_공백_오류테스트() {
        assertThatIllegalArgumentException().isThrownBy(() -> {
            Calculator calculator = new Calculator(new Expression("3  + 4"));
            int result = calculator.calculate();
        });
    }

    @DisplayName("사칙연산 아닌 기호 입력시 오류테스트")
    @Test
    public void 사칙연산아닌기호_오류테스트() {
        assertThatIllegalArgumentException().isThrownBy(() -> {
            Calculator calculator = new Calculator(new Expression("2 ! 3 * 5 $ 3"));
            int result = calculator.calculate();
        });
    }
}