package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OperatorTest {

    @DisplayName("더하기 테스트")
    @Test
    public void 더하기_테스트() {
        assertThat(Operator.PLUS.operate(3, 4)).isEqualTo(7);
    }

    @DisplayName("빼기 테스트")
    @Test
    public void 빼기_테스트() {
        assertThat(Operator.MINUS.operate(10, 5)).isEqualTo(5);
    }

    @DisplayName("곱하기 테스트")
    @Test
    public void 곱하기_테스트() {
        assertThat(Operator.MULTIPLY.operate(3, 4)).isEqualTo(12);
    }

    @DisplayName("나누기 테스트")
    @Test
    public void 나누기_테스트() {
        assertThat(Operator.DIVIDE.operate(10, 2)).isEqualTo(5);
    }

}