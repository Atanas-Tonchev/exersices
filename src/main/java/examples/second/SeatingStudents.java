package examples.second;
import java.util.ArrayList;
import java.util.List;
public class SeatingStudents {
    public int SeatingStudents(int[] array) {
        int allDesk = array[0];
        int count = 0;
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        for (int i = 1; i < array.length; i++) {
            list1.add(array[i]);
        }
        for (int j = 1; j <= allDesk; j++ ){
            list.add(j);
            for (Integer integer : list1){
                list.remove(integer);
            }
        }
        for (int k = 0; k < list.size(); k++){
            int z = list.get(k);
            int a = 0;
            int b = 0;
            if(z % 2 != 0) {
               // System.out.println("1: "+list.get(k));
                a = z;
            }else {
                b = z;
                //System.out.println("2: "+list.get(k));
            }
            if (list.contains((a+2))) {
                count++;
            }
            if (list.contains((b+2))) {
                count++;
            }
            if(list.contains((a+1))){
                System.out.println("aaa: "+(a+1));
                if((a+1)>1) {
                    //count++;
                }
            }
            if(list.contains((b+1))){
                System.out.println("bbb: "+(b+1));
                if((a+1)>1) {
                   // count++;
                }
            }
            /*if (list.contains() {
                count++;
            }*/

            // System.out.println(b);
            //System.out.println("3: "+sideDesk);
        }

        System.out.println(list1);
        System.out.println(list);
        return count;
    }
}
