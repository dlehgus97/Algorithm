import java.io.*;
import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String word = s.toLowerCase();
        
        StringTokenizer st = new StringTokenizer(word, " ",true); // 구분자도 토큰으로 판단 
        while (st.hasMoreTokens()){
            String str = st.nextToken();
            if(str.equals(" ")){
                answer += " ";
            }
            else{
                if(str.charAt(0)>='a'){
                        answer += (char)(str.charAt(0) - 32);
                    }
                else{
                    answer += str.charAt(0);
                }
                for(int i = 1; i<str.length(); i++){ 
                    answer += str.charAt(i);
                }
            }
        }
        return answer;
    }
}