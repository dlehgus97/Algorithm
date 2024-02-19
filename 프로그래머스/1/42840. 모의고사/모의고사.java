import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] answers) {
        int [] stu1 = {1,2,3,4,5};
        int [] stu2 = {2,1,2,3,2,4,2,5};
        int [] stu3 = {3,3,1,1,2,2,4,4,5,5};
        
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
            
        for(int i = 0 ; i<answers.length; i++){
            if(stu1[i % 5] == answers[i]){
                count1++;
            }
            if(stu2[i % 8] == answers[i]){
                count2++;
            }
            if(stu3[i % 10] == answers[i]){
                count3++;
        }
    }
        
        int max = Math.max(count1,Math.max(count2,count3));
        int tmp = 0;
        
        ArrayList<Integer>list = new ArrayList<>();
        
        if(max == count1){
            tmp++;
            list.add(1);
        }
        if(max == count2){
            tmp++;
            list.add(2);
        }
        if(max == count3){
            tmp++;
            list.add(3);
        }
       
        
        int [] answer = new int [tmp];
        
        for(int i = 0 ; i<tmp; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}