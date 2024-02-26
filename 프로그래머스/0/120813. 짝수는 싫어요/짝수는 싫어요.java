import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer>list = new ArrayList<>();
        
        for(int i = 1;  i<=n; i++){
            if(i % 2 != 0){
                list.add(i);
            }
        }
        int [] answer = new int [list.size()];
        
        for(int i = 0 ; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}