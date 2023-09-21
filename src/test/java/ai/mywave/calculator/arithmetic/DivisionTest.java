package ai.mywave.calculator.arithmetic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DivisionTest {

    @Test
    public void shouldDivide() {
        var division = new Division();
        var actual = division.divide(2.1, 1.2);
        assertEquals(1.7500000000000002, actual);
    }

    @Test
    public void shouldReturnInfinity() {
        var division = new Division();
        var actual = division.divide(1, 0);
        assertEquals(Double.POSITIVE_INFINITY, actual);
    }

    @Test
    public void shouldReturnZero() {
        var division = new Division();
        var actual = division.divide(0, 1);
        assertEquals(0, actual);
    }

    @Test
    public void shouldReturnNan() {
        var division = new Division();
        var actual = division.divide(0, 0);
        assertEquals(Double.NaN, actual);
    }
}