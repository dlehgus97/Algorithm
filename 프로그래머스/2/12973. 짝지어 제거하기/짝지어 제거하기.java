import java.util.*;

class Solution{
    public int solution(String s){

        Stack<Character>stack = new Stack<>();
        
        for(int i = 0 ; i<s.length(); i++){
            char word = s.charAt(i);
            
            if(stack.isEmpty()){
                stack.push(word);
            }
            else{
                if(stack.peek() == word){
                    stack.pop();
                }
                else{
                    stack.push(word);
                }
            }
        }
        
        if(stack.isEmpty()){
            return 1;
        }
        else{
            return 0;
        }
    }
}