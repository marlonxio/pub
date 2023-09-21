package ai.mywave.calculator.arithmetic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ArithmeticInputParserTest {

    @Test
    public void shouldParseInputString() {
        var arithmeticInputParser = new ArithmeticInputParser();
        var actual = arithmeticInputParser.parse("123.123.234 + 234.234ASD.123");

        assertEquals(123.123, actual.getOperand1());
        assertEquals(234.234, actual.getOperand2());
        assertEquals(ArithmeticOperator.ADD, actual.getOperator());
    }

    @Test
    public void shouldReturnNullIfInvalidInput() {
        var arithmeticInputParser = new ArithmeticInputParser();
        var actual = arithmeticInputParser.parse("123.123blah");

        assertNull(actual);
    }
}