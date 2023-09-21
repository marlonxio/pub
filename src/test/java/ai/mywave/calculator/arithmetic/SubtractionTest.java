package ai.mywave.calculator.arithmetic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubtractionTest {

    @Test
    public void shouldSubtract() {
        var subtraction = new Subtraction();
        var actual = subtraction.subtract(2, 1);
        assertEquals(1, actual);
    }
}