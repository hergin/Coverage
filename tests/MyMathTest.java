import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    @Test
    void divideRegular() {
        assertEquals(2.0, MyMath.Divide(6.0, 3.0));
    }

    @Test
    void divideTo0() {
        assertThrows(ArithmeticException.class, () -> {
            MyMath.Divide(6.0, 0.0);
        });
    }

    @Test
    void fibonacciRegular() {
        assertEquals(1, MyMath.Fibonacci(1));
    }
}