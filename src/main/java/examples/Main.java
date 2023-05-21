package examples;
import examples.first.Valleys;
import examples.second.SeatingStudents;

public class Main {

    public static void main(String[] args) {
        int[] array = {6,4};

       // System.out.println("Result is: "+new Valleys().getValleys("UDDDUUDU",8));
        System.out.println(new SeatingStudents().SeatingStudents(array));
    }
}