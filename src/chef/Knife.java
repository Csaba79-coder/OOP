package chef;

public class Knife extends Tools {

    private String type;
    final String state = "cut";

    public Knife(String name, String material, double pieces, boolean usedForCooking, String type) {
        super(name, material, pieces, usedForCooking);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String useKnife() {
        return state;
    }
}
