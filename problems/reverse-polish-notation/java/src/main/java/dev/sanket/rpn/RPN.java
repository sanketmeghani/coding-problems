package dev.sanket.rpn;

import java.util.Arrays;
import java.util.Stack;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class RPN {

    public static double evaluate(String expression) {

        Stack<Double> stack = new Stack<>();

        Arrays.stream(expression.trim().split(" ")).forEachOrdered(processToken(stack));

        return stack.pop();
    }

    private static Consumer<String> processToken(Stack<Double> stack) {

        return (token) -> {

            switch (token) {

            case "+":
                performOperation(stack, addition);
                break;

            case "-":
                performOperation(stack, subtraction);
                break;

            case "*":
                performOperation(stack, multiplication);
                break;

            case "/":
                performOperation(stack, division);
                break;

            case "++":
                performUnaryOperation(stack, increamentByOne);
                break;

            case "--":
                performUnaryOperation(stack, decreamentByOne);
                break;

            default:
                stack.push(Double.valueOf(token));
            }
        };
    }

    private static void performOperation(Stack<Double> stack, BiFunction<Double, Double, Double> binaryOperation) {

        Double secondOperand = stack.pop();
        Double firstOperand = stack.pop();

        Double result = binaryOperation.apply(firstOperand, secondOperand);

        stack.push(result);
    }

    private static BiFunction<Double, Double, Double> addition = (firstOperand, secondOperand) -> firstOperand
            + secondOperand;

    private static BiFunction<Double, Double, Double> subtraction = (firstOperand, secondOperand) -> firstOperand
            - secondOperand;

    private static BiFunction<Double, Double, Double> multiplication = (firstOperand, secondOperand) -> firstOperand
            * secondOperand;

    private static BiFunction<Double, Double, Double> division = (firstOperand, secondOperand) -> firstOperand
            / secondOperand;

    private static void performUnaryOperation(Stack<Double> stack, Function<Double, Double> unaryOperation) {

        Double value = stack.pop();
        Double result = unaryOperation.apply(value);

        stack.push(result);
    }

    private static Function<Double, Double> increamentByOne = (value) -> value + 1;

    private static Function<Double, Double> decreamentByOne = (value) -> value + 1;
}
