package examples.second;
import java.util.ArrayList;
import java.util.List;
public class SeatingStudents {
    public int SeatingStudents(int[] array){
        int allDesk = array[0];
        int num = 0;
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int sum = 0;
            for (int j = 1; j< array.length; j++) {
                list1.add(array[j]);
            }
        System.out.println(list1);
            for (int i =1; i<=allDesk;i++){
                list.add(i);
            }
        System.out.println(list);
            for(int k =0;k<list.size();k++){
                //System.out.println(list.get(k));
                for (int m=0;m<list1.size();m++){
                    list.remove(list1.get(m));
                }
                sum += k;
                //System.out.println(sum);
                if (sum >= 1) {
                    System.out.println(sum);
                    num++;
                }
            }
        System.out.println(list);
       // System.out.println(list2);

        return num;
    }
}
