package Csaba.items;

public class Mouse {
    private int DPI;
    private String color;
    private boolean isWired;
    private boolean RGB;

    public Mouse() {
    }

    public int getDPI() {
        return DPI;
    }

    public void setDPI(int DPI) {
        this.DPI = DPI;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWired() {
        return isWired;
    }

    public void setWired(boolean wired) {
        isWired = wired;
    }

    public boolean isRGB() {
        return RGB;
    }

    public void setRGB(boolean RGB) {
        this.RGB = RGB;
    }

    public void printInfo() {
        System.out.println("DPI: " + getDPI());
        System.out.println("Color: " + getColor());
        System.out.println("Wireless: " + isWired());
        System.out.println("Has led light: " + isRGB());
    }
}
