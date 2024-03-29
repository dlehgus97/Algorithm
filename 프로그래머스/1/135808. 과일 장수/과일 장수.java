import java.io.*;
import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);
        
        int [][] arr = new int [score.length/m][m];
        
        
        if(score.length % m == 0){
            for(int i = 0 ; i<arr.length; i++){
                for(int j = 0 ; j<m; j++){
                    arr[i][j] = score[(i * m) + j];
                }
            }
            for(int i = 0 ; i<arr.length; i++){
                answer +=arr[i][0] * m * 1;
            }
        }
        else {
            for(int i = 0 ; i<arr.length ; i++){
                int count = 0 ;
                 for(int j = score.length - 1 - (i * m); j>=score.length - (i+1) * m; j--){
                    arr[i][count] = score[j];
                     count++;
                    }
                Arrays.sort(arr[i]);
                }
            
            
             for(int i = 0 ; i<arr.length; i++){
                answer +=arr[i][0] * m;
            }
        }
        
        return answer;
            }
        }
