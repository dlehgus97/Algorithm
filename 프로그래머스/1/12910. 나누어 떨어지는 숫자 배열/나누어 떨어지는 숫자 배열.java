import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        Arrays.sort(arr);
        int tmp = 0 ;
        
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                tmp ++;
            }
        }
        int [] answer = new int [tmp];
        if(tmp == 0){
            answer = new int [1];
            answer [0] = -1;
        }
        int count = 0;
        
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                answer[count] = arr[i];
                count++;
            }
        }
        
        if(tmp == 0){
            answer = new int [1];
            answer [0] = -1;
        }
        
        return answer;
    }
}