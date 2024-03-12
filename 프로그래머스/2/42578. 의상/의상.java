import java.io.*;
import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        
        HashMap<String,Integer>map = new HashMap<>();
        int result = 1;
        
        for(int i = 0 ; i<clothes.length; i++){
            String word = clothes[i][1];
            
            if(map.containsKey(word)){
                map.put(word,map.get(word) + 1);
            }
            else{
                map.put(word,1);
            }
        }
        
        for(int s : map.values()){
                result *= s+1;
            }
        
        answer = result - 1;
        
            
        return answer;
    }
}