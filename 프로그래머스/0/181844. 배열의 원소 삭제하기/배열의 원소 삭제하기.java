import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0 ; i <arr.length;i++){
            boolean check = true;
            for(int j = 0; j<delete_list.length; j++){
                if(arr[i] == delete_list[j]){
                    check = false;
                    break;
                }
            }
            if(check){
                list.add(arr[i]);
            }
        }
        int[] answer = new int [list.size()];
        
        for(int i = 0 ; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}