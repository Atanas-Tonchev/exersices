package examples.tasks;
import java.util.*;
import java.util.stream.Collectors;
public class FlippingUnSignIntegers {

    public String getUnSignIntegers(int n, Scanner scanner) {
        long maxNum = 4294967295L;
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(maxNum ^ scanner.nextInt());
        }

        return list.stream().map(Object::toString).collect(Collectors.joining("\n"));
    }
}