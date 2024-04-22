import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int [2];
        
        PriorityQueue<Integer> minPq = new PriorityQueue <>();
        PriorityQueue<Integer> maxPq = new PriorityQueue <>(Collections.reverseOrder());
        
        for(int i = 0 ; i<operations.length; i++){
            String str = operations[i];
            StringTokenizer st = new StringTokenizer(str);
            String word = st.nextToken();
            int num =Integer.parseInt(st.nextToken());
            
            if(word.equals("I")){
                maxPq.add(num);
                minPq.add(num);
            }
            else{
                if(maxPq.size() == 0){
                    continue;
                }
                else{
                    if(num == -1){
                        int tmp = minPq.remove();
                        maxPq.remove(tmp);
                    }
                    else{
                        int tmp = maxPq.remove();
                        minPq.remove(tmp);
                    }
                }
            }
        }
        if(maxPq.size() == 0){
            answer[0] = 0;
            answer[1] = 0;
        }
        else if (maxPq.size() == 1){
            int tmp  = maxPq.remove();
            answer[0] = tmp;
            answer[1] = tmp;
        }
        else{
            answer[0] = maxPq.remove();
            answer[1] = minPq.remove();
            }    
    
        return answer;
    }
}