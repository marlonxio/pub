package ai.mywave.calculator.arithmetic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArithmeticInputParser {

    public static String OPERAND_REGEX = "[0-9]+[.]?[0-9]*";
    private final Pattern operandPattern = Pattern.compile(OPERAND_REGEX);

    public ArithmeticInput parse(String input) {
        var inputArr = input.split(" ");
        if (inputArr.length == 3) {
            Matcher operand1matcher = operandPattern.matcher(inputArr[0]);
            Matcher operand2matcher = operandPattern.matcher(inputArr[2]);
            if (operand1matcher.find() && operand2matcher.find()) {
                String operand1 = operand1matcher.group();
                String operand2 = operand2matcher.group();
                return new ArithmeticInput(Double.parseDouble(operand1),
                        Double.parseDouble(operand2),
                        ArithmeticOperator.fromString(inputArr[1]));
            }
        }
        return null;
    }
}
