import java.util.Arrays;

class Solution {
    public String solution(String str) {
        String answer = "";
        
        str = str.toLowerCase();
        
        char[] words = str.toCharArray();
        
        Arrays.sort(words);
        
        answer = new String(words);
        
        return answer;
    }
}
