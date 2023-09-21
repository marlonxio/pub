package ai.mywave.calculator.arithmetic;

public class ArithmeticCalculator {

    private final Addition addition;
    private final Subtraction subtraction;
    private final Multiplication multiplication;
    private final Division division;

    public ArithmeticCalculator(Addition addition, Subtraction subtraction, Multiplication multiplication, Division division) {
        this.addition = addition;
        this.subtraction = subtraction;
        this.multiplication = multiplication;
        this.division = division;
    }

    public double calculateFrom(ArithmeticInput arithmeticInput) {
        ArithmeticOperator operator = arithmeticInput.getOperator();
        return switch (operator) {
            case ADD -> addition.add(arithmeticInput.getOperand1(), arithmeticInput.getOperand2());
            case SUBTRACT -> subtraction.subtract(arithmeticInput.getOperand1(), arithmeticInput.getOperand2());
            case MULTIPLY -> multiplication.multiply(arithmeticInput.getOperand1(), arithmeticInput.getOperand2());
            case DIVIDE -> division.divide(arithmeticInput.getOperand1(), arithmeticInput.getOperand2());
            default -> 0;
        };
    }
}
