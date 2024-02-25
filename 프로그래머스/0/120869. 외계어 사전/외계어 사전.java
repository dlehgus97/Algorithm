import java.io.*;
import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        Arrays.sort(spell);
        
        for(int i = 0 ; i<dic.length; i++){
            int count = 0;
            HashSet<Character>set = new HashSet<>();
            for(int j = 0 ; j<spell.length; j++){
                for(int k = 0 ; k<dic[i].length(); k++){
                    if(spell[j].charAt(0) == dic[i].charAt(k)){
                        count++;
                        set.add(dic[i].charAt(k));
                    }
                }
            }
            if(count == spell.length && set.size() == spell.length){
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}