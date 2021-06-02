package items;

public class Computer {
    private static final boolean TYPE_IS_ELECTRONIC = true;
    private static int memoryCapacity;
    private final boolean IS_DATA_HOLDER = true;
    public String color;
    public int piecesOfMonitors;

    public Computer() {
    }

    public static boolean isTypeIsElectronic() {
        return TYPE_IS_ELECTRONIC;
    }

    public static int getMemoryCapacity() {
        return memoryCapacity;
    }

    public static void setMemoryCapacity(int memoryCapacity) {
        Computer.memoryCapacity = memoryCapacity;
    }

    public boolean isIS_DATA_HOLDER() {
        return IS_DATA_HOLDER;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPiecesOfMonitors() {
        return piecesOfMonitors;
    }

    public void setPiecesOfMonitors(int piecesOfMonitors) {
        this.piecesOfMonitors = piecesOfMonitors;
    }

    public void printInfo() {
        System.out.println("Is the PC electronic: " + isTypeIsElectronic()); // + TYPE_IS_ELECTRONIC
        System.out.println("Memory capacity: " + getMemoryCapacity() + " RAM");
        System.out.println("Is data holder: " + isIS_DATA_HOLDER()); // + IS_DATA_HOLDER
        System.out.println("The color is: " + getColor());
        System.out.println("Pieces of monitors: " + getPiecesOfMonitors());
    }
}
