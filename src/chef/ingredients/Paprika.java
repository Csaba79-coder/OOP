package chef.ingredients;

public class Paprika extends Ingredients {

    private String color;
    private boolean isHot;
    private String type;

    public Paprika(String name, double amount, String unit, String state, String color, boolean isHot, String type) {
        super(name, amount, unit, state);
        this.color = color;
        this.isHot = isHot;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHot() {
        return isHot;
    }

    public void setHot(boolean hot) {
        isHot = hot;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
