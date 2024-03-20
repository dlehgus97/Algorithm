import java.io.*;
import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        String [] arr = new String [answer.length];
        
        for(int i = 0 ; i<strings.length; i++){
            arr[i] = Character.toString(strings[i].charAt(n));
            arr[i] += strings[i];
        }
        
        Arrays.sort(arr);
        
        for(int i = 0 ;  i<arr.length; i++){
            answer[i] = arr[i].substring(1,arr[i].length());
        }
        return answer;
    }
}