import java.util.*;
import java.io.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        int num = s.length();
        
        if(num % 2 == 0){
            answer += s.charAt((num / 2)-1);
            answer += s.charAt(num / 2);
        }
        else{
            answer += s.charAt(num / 2);
        }
        return answer;
    }
}