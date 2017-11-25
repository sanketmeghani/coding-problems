package dev.sanket.skiing;

import java.util.Scanner;

public class SkiingMain {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            int width = scanner.nextInt();
            int height = scanner.nextInt();

            MountainMap mountainMap = MountainMap.with(width, height);

            for (int row = 0; row < height; row++) {
                for (int column = 0; column < width; column++) {

                    int mountainHeight = scanner.nextInt();
                    mountainMap.setMountainHeight(row, column, mountainHeight);
                }
            }
            
            System.out.println(mountainMap);
        }
    }
}
