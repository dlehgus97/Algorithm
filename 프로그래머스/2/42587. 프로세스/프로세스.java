import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<Integer>que1 = new LinkedList<>();
        Queue<Integer>que2 = new LinkedList<>();
        
        for(int i = 0 ; i<priorities.length ; i++){
            que1.add(i);
            que2.add(priorities[i]);
        }
        
        while(true){
            int max = Collections.max(que2);
            
            if(max != que2.peek()){
                que1.add(que1.poll());
                que2.add(que2.poll());
            }
            else {
                if(que1.peek() == location){
                    answer ++;
                    break;
                }
                else{
                    que1.poll();
                    que2.poll();
                    answer++;
                }
            }
        }
        
        return answer;
    }
}