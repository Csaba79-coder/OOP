package list;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        System.out.println(numbers.get(0));

        numbers.forEach(System.out::println);
        System.out.println("-------------------");
        // size
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("index: " + i);
            System.out.println("The number: " + numbers.get(i));
        }
        System.out.println("-------------------");
        // index
        for (int i = 0; i < numbers.toArray().length; i++) {
            System.out.println("index: " + i);
            System.out.println("The number: " + numbers.get(i));
        }

        MyList myList = new MyList();
        myList.addNumbers(10);
        myList.addNumbers(20);
        myList.printAllElement();
    }
}
