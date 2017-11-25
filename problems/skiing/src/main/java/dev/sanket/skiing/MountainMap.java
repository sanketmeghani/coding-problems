package dev.sanket.skiing;

public class MountainMap {

    private int[][] mountains;

    private MountainMap(int width, int height) {
        this.mountains = new int[height][width];
    }

    public static MountainMap with(int width, int height) {

        MountainMap mountainMap = new MountainMap(width, height);

        return mountainMap;
    }

    public void setMountainHeight(int row, int column, int mountainHeight) {
        this.mountains[row][column] = mountainHeight;
    }
}
