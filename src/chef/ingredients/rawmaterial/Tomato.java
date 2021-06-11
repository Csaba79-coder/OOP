package chef.ingredients.rawmaterial;

import chef.ingredients.Ingredients;

public class Tomato extends Ingredients {

    private String color;

    public Tomato(String name, double amount, String unit, String state, String color) {
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
