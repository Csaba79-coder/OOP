package animals;

import animals.Cat;
import animals.Dog;

public class Main {

    /**
     * Csinálj egy programot ami számon tartja a ház körüli kutyákat
     * @param args
     */
    public static void main(String[] args) {
        Dog boroka = new Dog("Németjuhász", "Boróka");
        boroka.setColor("fehér");
        boroka.setAge(19);
        Dog bodri = new Dog("Keverék", "Bodri");
        bodri.setColor("kék");
        bodri.setAge(38);
        Dog bloki = new Dog("Border", "Blöki");
        Dog szervac = new Dog("Border", "Szervac", "tricolor", 1);

        Dog[] myDogs = {boroka, bodri, boroka, bodri, boroka, bodri, bloki, szervac};

        Cat cirmi = new Cat("Cirmi", "Black", 2, 9);
        Cat anhur = new Cat("Anhur the cat of war", "unknown", 5000, 10000);

        Cat[] cats = {cirmi, anhur};


        /*System.out.println(bodri.getName() + " " + bodri.getType());
        System.out.println(boroka.getName() + " " + boroka.getType());
        System.out.println(bloki.getName() + " " + bloki.getType());*/

        System.out.println(Dog.animalType);     // "Pet"
        Dog dog1 = new Dog();
        System.out.println(dog1.getName());     // "Pet"
        Dog.animalType = "Házikedvenc";
        System.out.println(Dog.animalType);     // "Házikedvenc"
        System.out.println(dog1.getName());     // "Pet"
        Dog dog2 = new Dog();
        System.out.println(dog2.getName());     // "Házikedvenc"
    }
}