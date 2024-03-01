import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer>list = new ArrayList<>();
        int i = 0;

        while(i<arr.length){
              if(list.isEmpty()){
                  list.add(arr[i]);
                  i++;
              }    
              else if(list.get(list.size() - 1) != arr[i]){
                  list.add(arr[i]);
                  i++;
              }
            else if(list.get(list.size()- 1) == arr[i]){
                list.remove(list.size() - 1);
                i++;
            }
        }
        int [] zero = {-1};
        if(list.size() == 0){
            return zero;
        }
       
        int[] stk = new int [list.size()];
        
        for(int j = 0 ; j<list.size(); j++){
            stk[j] = list.get(j);
        }

        return stk;
    }
}