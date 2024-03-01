import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        while(true){
        int [] copyarr = Arrays.copyOf(arr,arr.length);
            
            for(int i = 0 ; i<arr.length ; i++){
                if(arr[i] % 2 == 0 && arr[i]>50){
                    arr[i] /= 2;
                }
                else if(arr[i] % 2 !=0 && arr[i]<50){
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            boolean check = true;
            for(int i = 0 ; i<arr.length; i++){
                if(arr[i] != copyarr[i]){
                    check = false;
                    break;
                }
            }
            
            if(check){
                break;
            }
            answer++;
        }
        
        return answer;
    }
}