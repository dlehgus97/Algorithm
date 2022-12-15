class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() == 4 || s.length() ==6){
            answer = true;
        }
        else 
            answer  =false;
        for(int i = 0 ;i<s.length(); i++){
            if(s.charAt(i)>=65){
                answer = false;
                break;
                } 
            }
      return answer;  
    }
}

//문제를 제대로 읽었어야한다 4혹은 6일 떄만 인걸 확인 했어야한다 .
