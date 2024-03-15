class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        boolean [] alp = new boolean [26];
        
        for(int i = 0 ; i<skip.length(); i++){
            alp[skip.charAt(i) - 'a'] = true;
        }
        
        for(int i = 0 ; i<s.length(); i++){
            int count = 0 ;
            int tmp = (int)(s.charAt(i) - 'a') + 1;
            while(true){
                if(tmp >25){
                    tmp = 0;
                }
                if(!alp[tmp]){
                    count++;
                }
                if(count == index){
                    break;
                }
                tmp++;
            }
            
            answer += (char)('a' + tmp);
        }
        
        return answer;
    }
}