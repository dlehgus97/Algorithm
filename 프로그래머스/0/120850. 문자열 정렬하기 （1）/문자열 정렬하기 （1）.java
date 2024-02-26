import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer>list = new ArrayList<>();
        
        for(int i = 0 ; i<my_string.length(); i++){
            for(int j = 0 ; j<10; j++){
                if((int)my_string.charAt(i) - 48 == j){
                    list.add(j);
                }
            }
        }
        Collections.sort(list);
        
        int [] answer = new int[list.size()];
        
        for(int i = 0 ; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}