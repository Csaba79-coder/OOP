package animals;

public class Cat {
    public final String CAT_TYPE_NAME = "macska";        // konstans
    // public final String CAT_TYPE_NAME;       // meg kell adni az értékét minden konsturktorban
    public String name;
    public String color;
    public int age;
    public int livesLeft;

    public Cat() {
        //CAT_TYPE_NAME = "cirmike";
    }

    public Cat(String name, String color, int age, int livesLeft) {
        //CAT_TYPE_NAME = "cirmike";
        this.name = name;
        this.color = color;
        this.age = age;
        this.livesLeft = livesLeft;
    }

    /*public Cat(String name, String color, int age, int livesLeft, String cat_type_name) {
        CAT_TYPE_NAME = cat_type_name;
        this.name = name;
        this.color = color;
        this.age = age;
        this.livesLeft = livesLeft;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getLivesLeft() {
        return livesLeft;
    }

    public void setLivesLeft(int livesLeft) {
        this.livesLeft = livesLeft;
    }

    // setCAT_TYPE_NAME() -> Setters for read-only fields were not generated

    public String getCAT_TYPE_NAME() {
        return CAT_TYPE_NAME;
    }
}
