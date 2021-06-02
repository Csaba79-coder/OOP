package team;

public class Main {
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
    public static void main(String[] args) {
        TeamMate teamMate1 = new TeamMate("Flóra" , false, 10);
        TeamMate teamMate2 = new TeamMate("Szabina" , false, 10);
        TeamMate teamMate3 = new TeamMate("Zééé", true, 8);
        TeamMate teamMate4 = new TeamMate("Csaba", true, 11);
        System.out.println("The number of the team mates are: " + TeamMate.ManPower);
        teamMate1.printInfo();
        teamMate2.printInfo();
        teamMate3.printInfo();
        teamMate4.printInfo();
    }
}