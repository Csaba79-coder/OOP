package chef;

public class Ingredients {


    protected String name;
    protected double amount;
    protected String unit;
    protected String state;

    public Ingredients(String name, double amount, String unit, String state) {
        this.name = name;
        this.amount = amount;
        this.unit = unit;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
