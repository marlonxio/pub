package ai.mywave.calculator.arithmetic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArithmeticCalculatorTest {

    private final Addition addition = new Addition();
    private final Subtraction subtraction = new Subtraction();
    private final Multiplication multiplication = new Multiplication();
    private final Division division = new Division();

    private final ArithmeticCalculator calculator = new ArithmeticCalculator(addition, subtraction, multiplication, division);

    @Test
    public void shouldCalculateAdditionFromArithmeticInput() {
        var arithmeticInput = new ArithmeticInput(2.2, 3.4, ArithmeticOperator.ADD);
        var actual = calculator.calculateFrom(arithmeticInput);
        assertEquals(5.6, actual);
    }

    @Test
    public void shouldCalculateSubtractionFromArithmeticInput() {
        var arithmeticInput = new ArithmeticInput(10, 5, ArithmeticOperator.SUBTRACT);
        var actual = calculator.calculateFrom(arithmeticInput);
        assertEquals(5, actual);
    }

    @Test
    public void shouldCalculateMultiplicationFromArithmeticInput() {
        var arithmeticInput = new ArithmeticInput(2.5, 4, ArithmeticOperator.MULTIPLY);
        var actual = calculator.calculateFrom(arithmeticInput);
        assertEquals(10, actual);
    }

    @Test
    public void shouldCalculateDivisionFromArithmeticInput() {
        var arithmeticInput = new ArithmeticInput(5, 2, ArithmeticOperator.DIVIDE);
        var actual = calculator.calculateFrom(arithmeticInput);
        assertEquals(2.5, actual);
    }
}