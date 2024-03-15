import java.io.*;
import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String [players.length];
        
        HashMap<String,Integer>map = new HashMap<>();
        
        for(int i = 0 ; i<players.length; i++){
            map.put(players[i], i);
        }
        
        for(int i = 0 ; i<callings.length; i++){
            int a = map.get(callings[i]);
            String word = players[a - 1];
            
            players[a - 1] = callings[i];
            players[a] = word;
            
            map.put(callings[i] , a - 1);
            map.put(word,a);
        }
        
        answer = players;
        
        return answer;
    }
}

/* 9 ~13 시간초과 하나하나 다 비교해봐야함 동일할때 까지 
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String [players.length];
        
        for(int i = 0 ; i<callings.length; i++){
            int tmp = 0;
            for(int j = 0 ; j<players.length; j++){
                if(callings[i].equals(players[j])){
                    tmp = j;
                    break;
                }
            }
            
            String str = players[tmp];
            players[tmp] = players[tmp - 1];
            players[tmp - 1] = str;
        }
        answer = players;
        return answer;
    }
}*/