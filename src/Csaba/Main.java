package Csaba;

import Csaba.items.Book;
import Csaba.items.Glass;
import Csaba.items.Mouse;
import Csaba.items.Speaker;

public class Main {


    public static void main(String[] args) {

        Glass glass = new Glass();
        glass.setColor("white");
        glass.setMaterial("china");
        glass.setSize(3);
        glass.setPattern("none");
        // -----------------------------------
        Speaker speaker = new Speaker();
        speaker.setType("headset");
        speaker.setColor("black");
        speaker.setManufacturer("JVC");
        // -----------------------------------
        Mouse mouse = new Mouse();
        mouse.setDPI(1600);
        mouse.setColor("black");
        mouse.setWired(false);
        mouse.setRGB(true);
        // -----------------------------------
        Book book = new Book();
        book.setTitle("Cat among the pigeons");
        book.setWriter("Agathe Christie");
        book.setPages(256);
        book.setEbook(false);


        System.out.println("-----Glass-----");
        printMaterial(glass);
        System.out.println("----Speaker----");
        speaker.printInfo();
        System.out.println("-----Mouse-----");
        mouse.printInfo();
        System.out.println("-----Book------");
        book.printInfo();
    }

    public static void printMaterial(Glass glass) {
        System.out.println("Color: " + glass.getColor());
        System.out.println("Material: " + glass.getMaterial());
        System.out.println("Size: " + glass.getSize());
        System.out.println("Pattern: " + glass.getPattern());
    }
}
