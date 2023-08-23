package examples.tasks;

public class Valleys {

    public int getValleys() {
        int start = 8;
        String path = "UDDDUDUU";
        int a;
        int b;

        for (int i = 0; i < path.length(); i++) {
            int ch = path.charAt(i);
            if (ch == 85) {
                a = ch;
                System.out.println("Upp " + a);
            }
            if (ch == 68) {
                b = -ch;
                System.out.println("Down " + b);
            }
        }
        return start;
    }

    public static void main(String[] args) {

        System.out.println(new Valleys().getValleys());
    }
}
