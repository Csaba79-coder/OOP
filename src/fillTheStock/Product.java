package fillTheStock;

public class Product {

    private String name;
    private String type;
    private double quantity;
    private String unitQuantity;
    private double priceUnit;

    public Product(String name, String type, double quantity, String unitQuantity, double priceUnit) {
        this.name = name;
        this.type = type;
        this.quantity = quantity;
        this.unitQuantity = unitQuantity;
        this.priceUnit = priceUnit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getUnitQuantity() {
        return unitQuantity;
    }

    public void setUnitQuantity(String unitQuantity) {
        this.unitQuantity = unitQuantity;
    }

    public double getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(double priceUnit) {
        this.priceUnit = priceUnit;
    }


    public double getTotal() {
        return (quantity * priceUnit);
    }

}