package ai.mywave.calculator.arithmetic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplicationTest {

    @Test
    public void shouldMultiply() {
        var multiplication = new Multiplication();
        var actual = multiplication.multiply(20, 1.1);
        assertEquals(22.0, actual);
    }
}