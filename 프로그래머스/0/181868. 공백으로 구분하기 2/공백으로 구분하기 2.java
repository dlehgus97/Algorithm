import java.io.*;
import java.util.*;

class Solution {
    public String[] solution(String my_string) {
       
        String [] str = my_string.split(" ");
        ArrayList<String>list = new ArrayList<>();
        
        for(int i = 0 ; i<str.length; i++){
            if(!str[i].isEmpty()){
                list.add(str[i]);
            }
        }
        String [] answer = new String [list.size()];
        
        for(int i = 0 ; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}