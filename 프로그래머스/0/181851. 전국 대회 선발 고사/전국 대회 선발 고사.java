import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        
        HashMap<Integer,Integer>map = new HashMap<>();
        ArrayList<Integer>list = new ArrayList<>();
        
        for(int i = 0 ; i<rank.length; i++){
            if(attendance[i]){
               map.put(rank[i],i); 
               list.add(rank[i]);
            }
        }
        
        Collections.sort(list);
        int a = 10000;
       
       for(int i = 0 ; i<3; i++){
           answer += map.get(list.get(i)) * a;
            a /= 100;
        }
        
        return answer;
    }
}