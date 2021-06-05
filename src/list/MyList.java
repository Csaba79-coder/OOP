package list;


import java.util.ArrayList;

public class MyList {

    int[] array;

    public MyList() {
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }


    public void addNumbers(int number) {
        if (array == null) {
            array = new int[0];
            // or
//            array = new int[1];
//            array[0] = number;
//            return;
        }
        int[] temp = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        temp[array.length] = number;
        array = temp;
    }

    public void printAllElement() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


//    public int getElement() {
//
//    }
//
//    public int getSize() {
//
//    }
}




