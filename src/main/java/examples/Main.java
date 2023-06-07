package examples;
import examples.tasks.FlippingUnSignIntegers;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input numbers of queries: ");
        int q = scanner.nextInt();
        System.out.println("Please input numbers: ");
        System.out.println("Your result is: "+ "\n" +new FlippingUnSignIntegers().getUnSignIntegers(q,scanner));
    }
}