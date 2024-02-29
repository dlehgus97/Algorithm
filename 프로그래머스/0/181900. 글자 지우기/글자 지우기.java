import java.io.*;
import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        Arrays.sort(indices);
        
        int count = 0 ;
        
        for(int i = 0 ; i<my_string.length(); i++){
            if(i == indices[count]){
                if(count<indices.length - 1){
                    count++;
                }
                continue;
            }
            else{
                answer += my_string.charAt(i); 
            }         
        }
        return answer;
    }
}