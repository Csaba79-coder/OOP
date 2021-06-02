package chef;

public class Sausage extends  Ingredients {

    private String type;
    private boolean isSmoked;
    private boolean isHot;

    public Sausage(String name, double amount, String unit, String state, String type, boolean isSmoked, boolean isHot) {
        super(name, amount, unit, state);
        this.type = type;
        this.isSmoked = isSmoked;
        this.isHot = isHot;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isSmoked() {
        return isSmoked;
    }

    public void setSmoked(boolean smoked) {
        isSmoked = smoked;
    }

    public boolean isHot() {
        return isHot;
    }

    public void setHot(boolean hot) {
        isHot = hot;
    }
}
