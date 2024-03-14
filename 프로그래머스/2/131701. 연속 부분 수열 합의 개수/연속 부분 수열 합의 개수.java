import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        
        HashSet<Integer>set = new HashSet<>();
    
        for(int i  = 0 ; i<elements.length ;i++){
            int num = 0;
            for(int j = i ; j< i + elements.length; j++){
                num += elements[j % elements.length];
                set.add(num);
            }
        }
        answer = set.size();
        
        return answer;
    }
}