import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int [2];
        
        HashMap<Integer,Integer>map = new HashMap<>();
        
        for(int i = 0 ; i<array.length; i++){
            map.put(array[i],i);
        }
        
        Arrays.sort(array);
        
        answer[0] = array[array.length - 1] ;
        answer[1] = map.get(answer[0]);
        
        return answer;
    }
}