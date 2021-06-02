package chef;

public class Bowl extends Tools {

    private double size;
    private String unit;

    public Bowl(String name, String material, double pieces, boolean usedForCooking, double size, String unit) {
        super(name, material, pieces, usedForCooking);
        this.size = size;
        this.unit = unit;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
