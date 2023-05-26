package examples;
import examples.tasks.NumberOfLetter;

public class Main {

    public static void main(String[] args) {
        String s = "abbab";
        System.out.println(new NumberOfLetter().numberOfLetter(s,1));
    }
}