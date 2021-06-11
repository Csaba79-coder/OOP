package chef.ingredients.spices;

import chef.ingredients.Ingredients;

public class Pepper extends Ingredients {
    private String color;


    public Pepper(String name, double amount, String unit, String state, String color) {
        super(name, amount, unit, state);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
