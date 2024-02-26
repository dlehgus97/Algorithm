import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        HashSet<Integer>set = new HashSet<>();
        int num = 2 ;
        
        while(n > 1){
            if(n % num == 0){
                set.add(num);
                n /= num;
            }
            else{
                num++;
            }
        }
        
        int [] answer = new int [set.size()];
        
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        
        for(int i = 0 ; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}