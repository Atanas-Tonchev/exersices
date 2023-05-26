package examples;
import examples.tasks.NumberOfLetter;

public class Main {

    public static void main(String[] args) {
        String s = "aba";
        System.out.println(new NumberOfLetter().numberOfLetter(s,3));
    }
}