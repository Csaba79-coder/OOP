package chef;


import chef.ingredients.*;
import chef.ingredients.rawmaterial.*;
import chef.ingredients.spices.Pepper;
import chef.ingredients.spices.Salt;
import chef.tools.*;

public class Main {
    /**
     * Create a program which can handle ingredients, spices and kitchen tools.
     * Use your ingredients, spices and kitchen tools to make food!
     * example:
     *      Basic lecsó
     *      Cut the paprika, tomato, onion with the knife, you might need a cutting board
     *      Put the cut onion in the frying pan with some butter
     *      Add the cut paprika and tomato
     *      Let's start cooking
     *      Add some salt and spices
     *      Put the eggs in the frying pan
     *      Wait until it's done
     *      Bon appetit
     * @param args
     */

    public static void main(String[] args) {

        Paprika paprikaSweet = new Paprika("paprikaSweet", 0.5, "kg", "whole", "green", false, "regular TV");
        Paprika paprikaHot = new Paprika("paprikaHot", 0.5, "kg", "whole", "red and green", true, "Bogyiszló");
        Paprika paprikaPowder = new Paprika("paprikaPowder", 2, "teaspoon", "powder", "red", true, "Kalocsa");
        Tomato tomato = new Tomato("tomato", 0.5, "kg", "whole", "red");
        Onion onion = new Onion("onion", 2, "pieces", "whole", "bronze red","regular");
        Oil oil = new Oil("oil", 1, "dl", "liquid", "olive, extra virgin", "Bertolli");
        Ingredients water = new Ingredients("water", 1, "liter", "liquid");
        Pepper pepper = new Pepper("pepper", 6, "turn", "powder", "black");
        Salt salt = new Salt("salt", 6 , "turn", "powder", "iod", true);
        Egg egg = new Egg("egg", 6, "pieces", "whole", "farm", "XL", true);
        Sausage sausage = new Sausage("sausage", 1, "pair", "whole", "Gyulai", true, true);

        Bowl bowl = new Bowl("bowl", "metal", 1, true, 10, "liter");
        CookingPot cookingPotTomato = new CookingPot("cookingPotTomato", "metal", 1, true, 10, "liter");
        CookingPot cookingPotPaprika = new CookingPot("cookingPotPaprika", "metal", 1, true, 10, "liter");
        Knife knife = new Knife("knife", "metal", 1, true, "Kitchen");
        Tools kitchenSpoon = new Tools("kitchenSpoon", "wooden", 1, true);

        Stove electricStove = new Stove("electricStove", false, 4, "pieces");

        paprikaHot.setState(knife.useKnife()); //  because it is not a private!
        paprikaSweet.setState(knife.useKnife()); //  because it is not a private!
        onion.setState(knife.useKnife());
        sausage.setState(knife.useKnife());
        egg.setState(knife.useKnife());
        electricStove.concassé(tomato, knife);



        Ingredients[] lecsos = {tomato, paprikaHot, paprikaSweet, onion, egg, sausage, salt, pepper, water, oil, paprikaPowder};
        electricStove.cook(lecsos);

        for (Ingredients lecso : lecsos) {
            System.out.println(lecso.getName() + " " + lecso.getState());
        }



        System.out.println("\n-----------------\n");
        System.out.println("Lecsó is ready :)");
    }
}
