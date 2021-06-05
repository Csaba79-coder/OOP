package animals;

public class Dog {
    public static String animalType = "Pet";
    private String type;
    private String name;
    public String color;
    public int age;

    public Dog() {
        this.name = animalType;
    }

    public Dog(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public Dog(String type, String name, String color, int age) {
        this.type = type;
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
