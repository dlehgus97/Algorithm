class Solution {
    public String solution(String str) {
        String answer = "";
        String [] word = str.split("");
        
        for(int i = 0 ; i<word.length; i++){
            if(!answer.contains(word[i])){
                answer += word[i];
            }   
        }
        return answer;
    }
}
