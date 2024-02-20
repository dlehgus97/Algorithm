import java.util.*;
import java.io.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        
        Character [] str = new Character  [my_string.length()];
        
        for(int i = 0 ; i<str.length; i++){
            str[i] = (my_string.charAt(i));
        }
        Arrays.sort(str);
        
        for(int i = 0; i<str.length; i++){
            answer += str[i];
        }
        
            
        return answer;
    }
}