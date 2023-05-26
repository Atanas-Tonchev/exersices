package examples.second;
import java.util.ArrayList;
import java.util.List;
public class SeatingStudents {
    public int seatingStudents(int[] array) {
        int allDesk = array[0];
        int count = 0;
        List<Integer> occupied = new ArrayList<>();
        for (int i = 1; i < array.length; i++) {
            occupied.add(array[i]);
        }
        for (int j = 1; j < allDesk; j++ ){
            int nextToEachDesk = j+1;
            if(((j % 2) != 0) && (!occupied.contains(j)) && (!occupied.contains(nextToEachDesk))){
                count++;
            }
            int oneAfterAnotherDesk = j+2;
            if(oneAfterAnotherDesk<allDesk && !occupied.contains(oneAfterAnotherDesk) && !occupied.contains(j)){
                count++;
            }
        }
        return count;
    }
}
