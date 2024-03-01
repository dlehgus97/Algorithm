import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int [queries.length];
        
        for(int i = 0 ; i<answer.length; i++){
            ArrayList<Integer>list = new ArrayList<>();
            int count = -1;
            for(int j = queries[i][0]; j<=queries[i][1]; j++){
                list.add(arr[j]);        
            }
            Collections.sort(list);
            for(int j = 0 ; j<list.size(); j++){
                if(list.get(j)> queries[i][2]){
                    count = list.get(j);
                    break;
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}