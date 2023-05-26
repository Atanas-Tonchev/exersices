package examples;

import examples.tasks.SeatingStudents;

public class Main {

    public static void main(String[] args) {
        int[] array = {8, 1, 8};
        System.out.println(new SeatingStudents().seatingStudents(array));
    }
}