import java.io.*;
import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        
        for(int i = 0 ; i<queries.length; i++){
        StringBuilder sb = new StringBuilder();
            for(int j = 0; j<queries[i][0]; j++){
                sb.append(my_string.charAt(j));
            }
            for(int j = queries[i][1]; j>=queries[i][0] ; j--){
                sb.append(my_string.charAt(j));
            }
            for(int j = queries[i][1] + 1; j<my_string.length(); j++){
                sb.append(my_string.charAt(j));
            }
            my_string = sb.toString();
        }
        
        String answer = my_string;
        
        return answer;
    }
}