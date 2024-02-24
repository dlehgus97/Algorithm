import java.io.*;
import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        
        String [] arr1 = new String[before.length()];
        for(int i = 0 ; i<before.length(); i++){
            arr1[i] = String.valueOf(before.charAt(i));
        }
        
        String [] arr2 = new String[after.length()];
         for(int i = 0 ; i<after.length(); i++){
            arr2[i] = String.valueOf(after.charAt(i));
        }
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
            
        for(int i = 0 ; i<arr1.length; i++){
            if(!arr1[i].equals(arr2[i])){
                answer = 0;
                break;
            }
        }
        return answer;
    }
}