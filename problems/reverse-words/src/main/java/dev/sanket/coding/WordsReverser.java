package dev.sanket.coding;

import java.util.Stack;

public class WordsReverser {

    private String input;

    public WordsReverser(String input) {
        this.input = input;
    }

    public String reverse() {

        StringBuilder reversed = new StringBuilder();

        int currentIndex = 0;
        char[] characters = input.toCharArray();
        Stack<Character> stack = new Stack<>();

        while (currentIndex < input.length()) {

            char currentChar = characters[currentIndex];

            if (isSpace(currentChar)) {

                while (!stack.isEmpty()) {
                    reversed.append(stack.pop());
                }

                reversed.append(' ');

            } else {
                stack.push(Character.valueOf(currentChar));
            }

            currentIndex++;
        }

        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    private boolean isSpace(char character) {
        return character == ' ';
    }
}
