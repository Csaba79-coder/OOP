package chef;

public class Egg extends Ingredients {
    private String type;
    private String size;
    private boolean isUV;

    public Egg(String name, double amount, String unit, String state, String type, String size, boolean isUV) {
        super(name, amount, unit, state);
        this.type = type;
        this.size = size;
        this.isUV = isUV;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isUV() {
        return isUV;
    }

    public void setUV(boolean UV) {
        isUV = UV;
    }
}
