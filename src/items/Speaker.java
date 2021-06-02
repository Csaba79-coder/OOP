package items;

public class Speaker {
    private String type;
    private String color;
    private String manufacturer;

    public Speaker() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    public void printInfo() {
        System.out.println("Type: " + getType());
        System.out.println("Color: " + getColor());
        System.out.println("Manufacturer: " + getManufacturer());
    }
}
