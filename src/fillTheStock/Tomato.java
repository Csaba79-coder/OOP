package fillTheStock;

public class Tomato extends Product {

    private String color;
    private boolean isFirstClass;

    public Tomato(String name, String type, double quantity, String unitQuantity, double priceUnit, String color, boolean isFirstClass) {
        super(name, type, quantity, unitQuantity, priceUnit);
        this.color = color;
        this.isFirstClass = isFirstClass;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFirstClass() {
        return isFirstClass;
    }

    public void setFirstClass(boolean firstClass) {
        isFirstClass = firstClass;
    }
}
