import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        ArrayList<Integer>list = new ArrayList<>();
        while(true){
            list.add(n);
            if(n == 1){
                break;
            }
            if(n % 2 == 0 ){
                n /= 2;
            }
            else{
                n = (n*3) + 1;
            }
        }
        
        int [] answer = new int [list.size()];
        for(int i = 0 ; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}