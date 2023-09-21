package ai.mywave.calculator.arithmetic;

import java.util.Objects;

public class ArithmeticInput {
    private double operand1;
    private double operand2;
    private ArithmeticOperator operator;

    public ArithmeticInput(double operand1, double operand2, ArithmeticOperator operator) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }

    public double getOperand1() {
        return operand1;
    }

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public ArithmeticOperator getOperator() {
        return operator;
    }

    public void setOperator(ArithmeticOperator operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "ArithmeticInput{" +
                "operand1=" + operand1 +
                ", operand2=" + operand2 +
                ", operator=" + operator +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArithmeticInput that)) return false;
        return Double.compare(that.operand1, operand1) == 0
                && Double.compare(that.operand2, operand2) == 0 && operator == that.operator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(operand1, operand2, operator);
    }
}
