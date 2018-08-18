package dev.sanket;

import java.util.Stack;

public class LargestRectangle {
    
    public static long largestRectangle(int[] h) {

        Stack<Integer> indexStack = new Stack<>();
        long largestRectangle = Long.MIN_VALUE;

        int i = 0;
        while (i < h.length) {

            if (indexStack.isEmpty() || h[indexStack.peek()] <= h[i]) {
                indexStack.push(i);
                i++;
                continue;
            }

            long area = 0;
            int index = indexStack.pop();

            if (indexStack.isEmpty()) {
                area = h[index] * i;
            } else {
                area = h[index] * (i - indexStack.peek() - 1);
            }

            largestRectangle = Math.max(largestRectangle, area);
        }

        while (!indexStack.isEmpty()) {

            int index = indexStack.pop();
            long area = 0;

            if (indexStack.isEmpty()) {
                area = h[index] * h.length;
            } else {
                area = h[index] * (h.length - indexStack.peek() - 1);
            }

            largestRectangle = Math.max(largestRectangle, area);
        }

        return largestRectangle;
    }
}
