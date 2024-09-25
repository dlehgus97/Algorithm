import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int [prices.length];
        
        for(int i = 0; i<prices.length; i++){
            Stack<Integer>stack = new Stack<>();
            for(int j = i+1; j<prices.length; j++){
                if(prices[i]<=prices[j]){ // 주식가격이 크거나 같을 때 스택에 담는다 .
                    stack.push(prices[j]);
                }
                else{
                    stack.push(1);
                    break;
                }
            }
            answer[i] = stack.size();
        }
        return answer;
    }
}