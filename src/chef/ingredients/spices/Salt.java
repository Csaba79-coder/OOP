package chef.ingredients.spices;

import chef.ingredients.Ingredients;

public class Salt extends Ingredients {
    private String type;
    private boolean isSeaSalt;

    public Salt(String name, double amount, String unit, String state, String type, boolean isSeaSalt) {
        super(name, amount, unit, state);
        this.type = type;
        this.isSeaSalt = isSeaSalt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isSeaSalt() {
        return isSeaSalt;
    }

    public void setSeaSalt(boolean seaSalt) {
        isSeaSalt = seaSalt;
    }
}
