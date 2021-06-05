package chef;

public class Stove {
    private String name;
    private boolean isGas;
    private int cookTop;
    private String unit;

    public Stove(String name, boolean isGas, int cookTop, String unit) {
        this.name = name;
        this.isGas = isGas;
        this.cookTop = cookTop;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGas() {
        return isGas;
    }

    public void setGas(boolean gas) {
        isGas = gas;
    }

    public int getCookTop() {
        return cookTop;
    }

    public void setCookTop(int cookTop) {
        this.cookTop = cookTop;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void cook(Ingredients[] array) {
        for (int i = 0; i < array.length; i++) {
            String previousState = array[i].getState();
            array[i].setState(previousState + " and cooked");
        }
    }


    public void concassé(Tomato item, Knife knife) {
        item.setState("peeled and " + knife.useKnife());
    }
}
