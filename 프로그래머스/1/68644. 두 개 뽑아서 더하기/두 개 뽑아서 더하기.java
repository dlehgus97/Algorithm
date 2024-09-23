import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        HashSet<Integer>set = new HashSet<>();
        
        
       for(int i = 0 ; i<numbers.length - 1; i++){
           for(int j = i+1 ; j<numbers.length; j++){
               int num = numbers[i] + numbers[j];
               set.add(num);
           }
       } 
        
        int [] answer = new int [set.size()];
        
        ArrayList<Integer>list = new ArrayList<>(set);
        
        Collections.sort(list);
        
        for(int i = 0 ; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}