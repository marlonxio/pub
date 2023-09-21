package ai.mywave.calculator.arithmetic;

public enum ArithmeticOperator {
    ADD("+"), SUBTRACT("-"), MULTIPLY("*"), DIVIDE("/");
    final String sign;

    ArithmeticOperator(String sign) {
        this.sign = sign;
    }

    public static ArithmeticOperator fromString(String text) {
        for (ArithmeticOperator operator : ArithmeticOperator.values()) {
            if (operator.sign.equalsIgnoreCase(text)) {
                return operator;
            }
        }
        return null;
    }
}
