class Solution {
    public int solution(String s) {
        int answer = 1;
        
        int index = 0;
        int tmp = 0;
        
        for(int i = 0 ; i<s.length() - 1  ;i++){
            if(s.charAt(index) == s.charAt(i)){
                tmp++;
            }
            else{
                tmp--;
            }
            if(tmp == 0){
                answer++;
                index = i + 1;
            }
        }
       
        
        return answer;
    }
}