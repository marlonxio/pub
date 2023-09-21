package ai.mywave.calculator;

import ai.mywave.calculator.arithmetic.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("""
                Arithmetic operations: + | - | * | /
                Operand: [0-9]+[.]?[0-9]*
                Input format: Operand ‘ ‘ Operation ‘ ‘ Operand
                Type 'exit' and press 'Enter' to exit.""");

        var scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            var arithmeticInputParser = new ArithmeticInputParser();
            ArithmeticInput arithmeticInput = arithmeticInputParser.parse(input);

            if (arithmeticInput != null) {
                var addition = new Addition();
                var division = new Division();
                var subtraction = new Subtraction();
                var multiplication = new Multiplication();

                var calculator = new ArithmeticCalculator(addition, subtraction, multiplication, division);
                double result = calculator.calculateFrom(arithmeticInput);
                System.out.println(String.format("= %f", result));
            } else {
                System.err.println("Invalid input.");
            }
        }
    }
}
