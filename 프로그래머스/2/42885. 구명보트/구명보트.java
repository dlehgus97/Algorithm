
import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        
        int right = people.length - 1 ;
        int left = 0;
        
        while(right>=left){
            if(people[left] + people[right] <= limit){
                left++;
            }
            right--;
            answer++;
        }
       
        
        return answer;
    }
}

/* 효율성테스트 실패 코드 

import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        
        boolean [] check = new boolean[people.length];
        
        for(int i = 0 ; i<check.length; i++){
            check[i] = false;
        }
        
        for(int i = 0 ; i<people.length - 1; i++){
            for(int j = people.length - 1; j>i; j--){
                if(people[i] + people[j] <= limit && check[j] == false){
                    check[i] = true;
                    check[j] = true;
                    answer++;
                    break;
                }
            }
        }
        
        for(int i = 0 ; i<check.length; i++){
            if(!check[i]){
                answer++;
            }
        }
        
        return answer;
    }
}*/ 