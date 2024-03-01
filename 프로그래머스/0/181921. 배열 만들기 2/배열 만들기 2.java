import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer>list = new ArrayList<>();
        int [] answer = null;
        
        for(int i = l ; i<=r; i++){
            int num = i;
            boolean check = true;
            while(num>0){
                int tmp = num % 10;
                
                if(tmp != 5 && tmp != 0){
                    check = false ;
                    break;
                }
                num /= 10;
            }
            
            if(check){
                list.add(i);
            }
        }
        
        if(list.size() == 0){
            answer = new int [1];
            answer[0] = -1;
        }
        else {
            answer = new int [list.size()];
            for(int i = 0 ; i<answer.length; i++){
                answer[i] = list.get(i);
            }
        }
        return answer;
    }
}