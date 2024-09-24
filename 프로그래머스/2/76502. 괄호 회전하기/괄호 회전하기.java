import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for(int i = 0 ; i<s.length(); i++){
            String str = "";
            Stack<Character>stack = new Stack<>();
            
            for(int j = i; j< i + s.length(); j++){
                str += s.charAt(j %s.length());
            }
            
            for(int j = 0 ; j<str.length(); j++){
                char word = str.charAt(j);
                if(stack.isEmpty()){
                    stack.push(word);
                }
                else{
                    if(stack.peek() == '('){
                        if(word == ')'){
                            stack.pop();
                        }
                        else{
                            stack.push(word);
                        }
                    }
                    else if(stack.peek() == '['){
                        if(word == ']'){
                            stack.pop();
                        }
                        else{
                            stack.push(word);
                        }
                    }
                    else if(stack.peek() == '{'){
                        if(word == '}'){
                            stack.pop();
                        }
                        else{
                            stack.push(word);
                        }
                    }
                    else{
                        stack.push(word);
                    }
                }
            }
            if(stack.isEmpty()){
                answer++;
            }
        }
        return answer;
    }
}