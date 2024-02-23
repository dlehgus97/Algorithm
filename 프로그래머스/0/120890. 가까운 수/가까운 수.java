import java.io.*;
import java.util.*;


class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        int min = 101 ;
        
        for(int i = 0 ; i<array.length; i++){
            if(min > Math.abs(array[i] - n)){
                min = Math.abs(array[i]-n);
                answer =  array[i];
            }
            else if(min == Math.abs(array[i] - n)){
                if(answer > array[i]){
                    answer = array[i];
                }
            }
        }
        return answer;
    }
}