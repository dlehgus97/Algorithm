import java.io.*;
import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {   
        int answer = 0;
        
        ArrayList<Integer>list = new ArrayList<>();
        for(int i = 0 ; i<section.length; i++){
            boolean check = false;
            if(!list.contains(section[i])){
                for(int j = section[i]; j<section[i] + m; j++){
                        list.add(j);
                    }
                check = true;
            }
            else{
                continue;
            }
            if(check){
                answer++;
            }
        }
       
          
        return answer;
    }
}