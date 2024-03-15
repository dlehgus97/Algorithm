import java.io.*;
import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int [] arr ={a,b,c,d};
        
        Arrays.sort(arr);
        if(arr[0] == arr[1]  && arr[1] == arr[2] && arr[2] == arr[3]){
            answer = 1111 * arr[0];
        }
        else if(arr[0] == arr[1] && arr[1] == arr[2] && arr[2] != arr[3]){
            answer = (int)Math.pow((10 * arr[0]) + arr[3], 2);
        }
        else if(arr[0] == arr[1] && arr[1] == arr[3] && arr[2] != arr[3]){
            answer = (int)Math.pow((10 * arr[0]) + arr[2], 2);
        }
        else if(arr[0] == arr[2] && arr[2] == arr[3] && arr[1] != arr[3]){
            answer = (int)Math.pow((10 * arr[0]) + arr[1], 2);
        }
        else if(arr[1] == arr[2] && arr[2] == arr[3] && arr[3] != arr[0]){
            answer = (int)Math.pow((10 * arr[2]) + arr[0], 2);
        }   
        else if(arr[0] == arr[1] && arr[1] != arr[2]){
            if(arr[2] == arr[3]){
                answer = Math.abs(arr[2] - arr[1]) * (arr[1] + arr[2]);
            }
            else{
                answer = arr[2] * arr[3];
            }
        }
        else if(arr[0] == arr[2] && arr[1] != arr[2]){
            if(arr[1] == arr[3]){
                answer = Math.abs(arr[2] - arr[1]) * (arr[2] + arr[1]);
            }
            else{
                answer = arr[1] * arr[3];
            }
        }
        else if(arr[0] == arr[3] && arr[1] != arr[3]){
            if(arr[1] == arr[2]){
                answer = Math.abs(arr[0] - arr[1]) * (arr[0] + arr[1]);
            }
            else{
                answer = arr[1] * arr[2];
            }
        }
        else if(arr[1] == arr[2] && arr[1] != arr[0]){
            if(arr[0] == arr[3]){
                answer = Math.abs(arr[0] - arr[2]) * (arr[0] + arr[2]);
            }
            else{
                answer = arr[0] * arr[3];
            }
        }
        else if(arr[1] == arr[3] && arr[1] != arr[0]){
            if(arr[0] == arr[2]){
                answer = Math.abs(arr[0] - arr[1]) * (arr[0] + arr[1]);
            }
            else{
                answer = arr[0] * arr[2];
            }
        }
        else if(arr[2] == arr[3] && arr[0] != arr[3]){
            if(arr[0] == arr[1]){
                answer = Math.abs(arr[0] - arr[2]) * (arr[0] + arr[2]);
            }
            else{
                answer = arr[0] * arr[1];
            }
        }
        else if(arr[0] != arr[1] && arr[1] != arr[2] && arr[2] != arr[3] && arr[3]!= arr[0]){
            answer = arr[0];
            
        }
        
        return answer;
    }
}
