import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        HashMap<String,Integer> map = new HashMap<>();
        
        for(int i = 0 ; i<want.length; i++){
            map.put(want[i],number[i]);
        }
        
        for(int i = 0 ; i<discount.length - 9 ; i++){
            HashMap<String, Integer> diff_map = new HashMap<>();
            for(int j = i ; j<i+10; j++){
                if(diff_map.containsKey(discount[j])){
                    diff_map.put(discount[j],diff_map.get(discount[j]) + 1);
                }
                else{
                    diff_map.put(discount[j],1);
                }
            }
            
            boolean check = true;
            
            for(int j = 0 ; j<want.length; j++){
                if(map.get(want[j]) != diff_map.get(want[j])){
                    check = false;
                    break;
                }   
            }
            if(check){
                answer++;
                System.out.println(i);
            }
        }
        return answer;
    }
}