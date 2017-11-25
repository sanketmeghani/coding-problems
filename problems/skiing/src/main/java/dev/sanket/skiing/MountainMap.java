package dev.sanket.skiing;

public class MountainMap {

    private int[][] mountains;

    private MountainMap(int width, int height) {
        this.mountains = new int[height][width];
    }

    public static MountainMap with(int width, int height) {
        return new MountainMap(width, height);
    }

    public void setMountainHeight(int row, int column, int mountainHeight) {
        this.mountains[row][column] = mountainHeight;
    }

    @Override
    public String toString() {

        StringBuilder output = new StringBuilder();

        for (int row = 0; row < mountains.length; row++) {
            for (int column = 0; column < mountains[row].length; column++) {
                output.append(mountains[row][column] + " ");
            }

            output.append("\n");
        }
        
        return output.toString();
    }
}
