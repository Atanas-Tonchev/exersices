package examples.tasks;

public class SortArray {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int length = 100000;
        //int sum=0;
        ArrayGenerator arrayGenerator1 = new ArrayGenerator(length);
        int[] arr = arrayGenerator1.generateArray(length);
        //System.out.println(Arrays.toString(arr));
        // call method using class name
        SortArray.bubbleSort(arr);
        System.out.println("Array After Bubble Sort");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        long start = System.currentTimeMillis();
        System.out.println("Total time: " + (System.currentTimeMillis() - start) + "ms");
    }

}
























