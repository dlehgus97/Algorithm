import java.util.*;
import java.io.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        int [] arr = new int [str.length()];
        
        for(int i = 0 ; i<str.length(); i++){
             arr[i] = (int) (n % 10);
             n /= 10;
        }
        
        Arrays.sort(arr);
        
        String result = "";
        
        for(int i = arr.length-1 ; i>=0 ; i--){
            result += Integer.toString(arr[i]);
        }
        
        answer = Long.parseLong(result);
        
        return answer;
    }
}