package examples.tasks;
import java.util.ArrayList;
import java.util.List;
public class NumberOfLetter {
    public int numberOfLetter(String s,int n){
        int count = 0;
        List<Character> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            list.add(s.charAt(i));
        }
        for (int m = 0; m < n;m++ ){
            list.add(list.get(m));
        }
        for(Character character : list){
            if(character =='a'){
                count++;
            }
        }
        return count;
    }
}
