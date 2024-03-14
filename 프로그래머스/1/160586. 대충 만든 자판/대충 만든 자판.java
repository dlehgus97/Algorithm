import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int [targets.length];
        
        int [] arr = new int [26];
        
        int num = Integer.MAX_VALUE;
        
        Arrays.fill(arr,Integer.MAX_VALUE);
        
        for(int i = 0 ; i<keymap.length; i++){
            for(int j = 0 ; j<keymap[i].length(); j++){
                arr[keymap[i].charAt(j) - 'A'] = Math.min(arr[keymap[i].charAt(j) - 'A'] ,j + 1);
            }
        }
        
        for(int i = 0 ; i<targets.length; i++){
            int tmp = 0;
            for(int j = 0 ; j<targets[i].length() ; j++){
                if(arr[targets[i].charAt(j) - 'A'] == num){
                    tmp = -1;
                    break;
                }
                else{
                    tmp += arr[targets[i].charAt(j) - 'A'];
                }
            }
            answer[i] = tmp;
        }
        
        return answer;
    }
}