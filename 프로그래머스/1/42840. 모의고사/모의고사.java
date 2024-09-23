import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {2,1,2,3,2,4,2,5};
        int [] arr3 = {3,3,1,1,2,2,4,4,5,5};
        int [] result = new int [3];
        
        for(int i = 0 ; i<answers.length ; i++){
            if(answers[i] == arr1[i % arr1.length]){
                result[0]++;
            }
            if(answers[i] == arr2[i % arr2.length]){
                result[1]++;
            }
            if(answers[i] == arr3[i % arr3.length]){
                result[2]++;
            }
        }
        
        int max = Math.max(result[0],Math.max(result[1],result[2]));
        
        ArrayList<Integer>list = new ArrayList<>();
        
        
        if(result[0] == max){
            list.add(1);
        }
        if(result[1] == max){
            list.add(2);
        }
        if(result[2] == max){
            list.add(3);
        }
        
        int[] answer = new int [list.size()];
        
        for(int i = 0 ;i <list.size(); i++){
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}