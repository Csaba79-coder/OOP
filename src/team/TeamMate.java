package team;


/**
 * Create a program which contains the TeamMate class with at least the following properties:
 *      ManPower - should be a static class variable containing the number of people in the team
 *          Needs to be incremented by every new TeamMate
 *      Name - The name of the teammate
 *      Sex - The sex of the teammate
 *      Mood - The mood of the teammate
 *  The TeamMate class should be placed in the .team package
 * Create the people in Your team in the main() method
 */


public class TeamMate {

    public static int ManPower = 0;
    public String name;
    public boolean isGenderMale;
    public int mood;


    public TeamMate(String name, boolean isGenderMale, int mood) {
        this.name = name;
        // System.out.println("I created a new team mate!");
        this.isGenderMale = isGenderMale;
        this.mood = mood;
        ++ManPower;
        // System.out.println("The number of the team mates are: " + ManPower); // it writes after each line the number!
    }

    public static int getManPower() {
        return ManPower;
    }

    public static void setManPower(int manPower) {
        ManPower = manPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGenderMale() {
        return isGenderMale;
    }

    public void setGenderMale(boolean genderMale) {
        isGenderMale = genderMale;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public void printInfo() {
        // System.out.println("The number of the team mate is: " + (++ManPower) );
        System.out.println("The name of the team mate is: " + getName());
        System.out.println("The gender of the team mate is male: " + isGenderMale());
        System.out.println("The mood of the team mate is (1-10): " + getMood());
    }
}
