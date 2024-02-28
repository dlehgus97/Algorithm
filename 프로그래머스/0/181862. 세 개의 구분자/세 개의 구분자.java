import java.io.*;
import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String word = myStr.replace("a","0");
        word = word.replace("b","0");
        word = word.replace("c","0");
        
        ArrayList<String>list = new ArrayList<>();
        String str = "";
        
        for(int i = 0 ; i<myStr.length(); i++){
            if(word.charAt(i) != '0'){
                str +=word.charAt(i);
            }
            else{
                if(str.isEmpty()){
                    continue;
                }
                else{
                    list.add(str);
                    str = "";
                }
            }
        }
        
        if(!str.isEmpty()){
            list.add(str);
        }
        
        String [] answer;
        if(list.size() == 0){
            answer = new String[1];
            answer[0] = "EMPTY";
        }
        else{
        answer = new String[list.size()];
            for(int i = 0 ; i<answer.length; i++){
            answer[i] = list.get(i);
            }
        }
       
        return answer;
    }
}