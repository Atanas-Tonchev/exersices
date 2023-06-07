package examples.tasks;
import java.util.*;
import java.util.stream.Collectors;
public class FlippingUnSignIntegers {

    public String getUnSignIntegers(int n, Scanner scanner) {
        List<Long> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add(toBinaryFlip(scanner.nextInt()));
        }

        return list.stream().map(Object::toString).collect(Collectors.joining("\n"));
    }
    public static long toBinaryFlip(int x) {
        StringBuilder result = new StringBuilder();
        long unsignedMaxValue = Integer.toUnsignedLong(Integer.parseUnsignedInt("4294967295"));
        String maxValue = toBinary32Bit(unsignedMaxValue);
        for(int i = 31; i >= 0 ; i--) {
            int mask = 1 << i;
            result.append((x & mask) == 0 ? 1 : 0);
        }
        if(!result.toString().equals(maxValue)) {

            return unsignedMaxValue - x;
        }

        return unsignedMaxValue;
    }
    public static String toBinary32Bit(long x) {
        String result = Long.toBinaryString(x);
        return String.format("%32s", result).replaceAll(" ", "0");  // 32-bit Integer
    }
}