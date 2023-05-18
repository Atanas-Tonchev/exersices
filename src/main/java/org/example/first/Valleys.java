package org.example.first;
public class Valleys {
    public int getValleys(String path,int steps){
        int count = 0;
        int valleys=0;
        for (int i = 0; i < steps; i++){
            if((path.charAt(i)) == 'U'){
                count += 1;
                if (count==0){
                    valleys+=1;
                }
            }else {
                count -= 1;
            }
        }
        return valleys;
    }

}

