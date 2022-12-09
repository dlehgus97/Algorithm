class Solution {
    public String solution(String str) {
        String answer = "";
        for(int i = 0 ; i<str.length(); i++){
            if(str.charAt(i)<'a')
                answer += (char)(str.charAt(i)+32);
            else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                answer += (char)(str.charAt(i)-32);
            }
        }
        return answer;
    }
}
