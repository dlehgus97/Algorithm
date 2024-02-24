class Solution {
    public String solution(String my_string) {
        String answer = "";
        char [] ch = my_string.toCharArray();
        
        for(int i = 0; i<ch.length; i++){
            if(!answer.contains(String.valueOf(ch[i]))){
                answer +=ch[i];
            }
        }
        return answer;
    }
}