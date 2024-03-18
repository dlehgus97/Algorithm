import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int [N];
        double [] arr = new double[N];
        int [] num = new int [N];
        double [] copy = new double[N];
        
        int len = stages.length;
        
        for(int i = 0 ; i<N; i++){
            int count = 0 ;
            
            for(int j = 0 ; j<stages.length ; j++){
                if(stages[j] == i + 1){
                    count++;
                    }
                }
            
            arr[i] = (double)count / (double)len;
            if(len == 0){
                arr[i] = 0.0;
            }
            copy[i] = arr[i];
            len -= count; 
            num[i] = i + 1;
        }
        
        Arrays.sort(arr);
        
        boolean [] check = new boolean [N];
        
    
        for(int i = 0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
        
        int index = 0;
        
        for(int i = N - 1 ; i>=0; i--){
            for(int j = 0 ; j<copy.length; j++){
                if(arr[i] == copy[j] && !check[j]){
                    answer[index] = num[j];
                    check[j] = true;
                    index++;
                    break;
                }
            }
        }
        return answer;
    }
}