package dev.sanket;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ShortestSubSegment {

    public static void process() {
        
        try (Scanner in = new Scanner(System.in)) {

            String text = in.nextLine().replaceAll("[^A-Za-z ]+", "");

            int noOfWords = Integer.parseInt(in.nextLine());
            Set<String> words = new HashSet<>();

            for (int count = 0; count < noOfWords; count++) {
                String word = in.nextLine();
                words.add(word.toLowerCase());
            }

            String[] originalTokens = text.split(" ");
            String[] tokens = text.toLowerCase().split(" ");

            int startIndex = 0;

            while ((startIndex < tokens.length) && !words.contains(tokens[startIndex])) {
                startIndex++;
            }

            if (startIndex == tokens.length) {
                System.out.println("NO SUBSEGMENT FOUND");
                return;
            }

            Set<String> foundWords = new HashSet<>();

            foundWords.add(tokens[startIndex]);
            int endIndex = startIndex + 1;
            int minStartIndex = 0;
            int minEndIndex = Integer.MAX_VALUE;
            boolean found = false;

            while (endIndex < tokens.length) {

                while (foundWords.contains(tokens[endIndex]) && tokens[startIndex].equals(tokens[endIndex])) {
                    startIndex++;
                }

                while ((startIndex < (tokens.length - 1)) && (((!words.contains(tokens[startIndex])))
                        || (tokens[startIndex].equals(tokens[startIndex + 1])))) {
                    startIndex++;
                }

                if (!words.contains(tokens[endIndex])) {

                    endIndex++;
                    continue;
                }

                foundWords.add(tokens[endIndex]);

                if (foundWords.equals(words)) {
                    found = true;
                    if (endIndex - startIndex < minEndIndex - minStartIndex) {
                        minStartIndex = startIndex;
                        minEndIndex = endIndex;
                    }

                    foundWords.clear();
                    startIndex = startIndex + 1;
                    endIndex = startIndex;
                } else {
                    endIndex++;
                }
            }

            StringBuilder output = new StringBuilder();

            if (found) {
                for (int index = minStartIndex; index <= minEndIndex; index++) {
                    output.append(originalTokens[index]);

                    if (index < minEndIndex) {
                        output.append(" ");
                    }
                }
            } else {
                output.append("NO SUBSEGMENT FOUND");
            }

            System.out.print(output);
        }
    }
}
