import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        for(int i = 0 ; i<3 ;i++){
            int a = Math.abs(dots[3][0] - dots[i][0]);
            int b = Math.abs(dots[3][1] - dots[i][1]);
            int c = Math.abs(dots[(i+1) % 3][0] - dots[(i+2) % 3][0]);
            int d = Math.abs(dots[(i+1) % 3][1] - dots[(i+2) % 3][1]);
            
            if(((float)b / (float)a)  == ((float)d / (float)c)){
                answer = 1;
                break;
            }
            
        }
        return answer;
    }
}