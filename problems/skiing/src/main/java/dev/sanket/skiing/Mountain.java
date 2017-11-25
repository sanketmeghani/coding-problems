package dev.sanket.skiing;

public class Mountain {
    private int height;

    private Mountain(int height) {
        this.height = height;
    }

    public static Mountain withHeight(int height) {
        return new Mountain(height);
    }
    
    @Override
    public String toString() {
        return String.valueOf(height);
    }
}
