import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] pow = {1,2,4,8,16,32,64,128,256,512,1024};
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int count = 0;
        for(int i = 0 ; i<arr.length; i++){
            list.add(arr[i]);
        }
        
        for(int i = 0 ; i<pow.length; i++){
            if(pow[i] >= list.size()){
               count = pow[i];
                break;
            }
        }
        
        if(count == list.size()){
            return arr;
        } 
        else {
            for(int i = arr.length; i<count; i++){
                list.add(0);
            }
            
            int[] answer = new int [list.size()];
            
            for(int i = 0 ; i<list.size(); i++){
                answer[i] = list.get(i);
            }
            return answer; 
        }
    }
}
