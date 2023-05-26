package examples.tasks;
public class NumberOfLetter {
    public long numberOfLetter(String s,long n){
        int size = s.length();
        long count = 0;

        for(int i = 0; i < size; i++) {
            if (s.charAt(i)=='a') {
                count++;
            }
        }

        long a = (n / size);
        count = count * a;

        long k = (n % size);
        for (int i = 0; i < k; i++) {
            if (s.charAt(i)=='a') {
                count++;
            }
        }
        return count;
    }
}
