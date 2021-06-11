package chef.tools;

public class Tools {

    protected String name;
    protected String material;
    protected double pieces;
    protected boolean usedForCooking;

    public Tools(String name, String material, double pieces, boolean usedForCooking) {
        this.name = name;
        this.material = material;
        this.pieces = pieces;
        this.usedForCooking = usedForCooking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPieces() {
        return pieces;
    }

    public void setPieces(double pieces) {
        this.pieces = pieces;
    }

    public boolean isUsedForCooking() {
        return usedForCooking;
    }

    public void setUsedForCooking(boolean usedForCooking) {
        this.usedForCooking = usedForCooking;
    }
}
