package examples.tasks;
import java.util.ArrayList;
import java.util.List;
public class SeatingStudents {
    public int seatingStudents(int[] array) {
        int allDesk = array[0];
        int count = 0;
        List<Integer> occupiedDesks = new ArrayList<>();
        for (int i = 1; i < array.length; i++) {
            occupiedDesks.add(array[i]);
        }
        for (int j = 1; j < allDesk; j++ ){
            int nextToEachDesk = j+1;
            if(((j % 2) != 0) && (!occupiedDesks.contains(j)) && (!occupiedDesks.contains(nextToEachDesk))){
                count++;
            }
            int oneAfterAnotherDesk = j+2;
            if(oneAfterAnotherDesk<=allDesk && !occupiedDesks.contains(oneAfterAnotherDesk) && !occupiedDesks.contains(j)){
                count++;
            }
        }
        return count;
    }
}
