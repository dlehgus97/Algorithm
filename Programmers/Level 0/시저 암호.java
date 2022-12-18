class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0 ; i<s.length(); i++){
            if(s.charAt(i) + 0 == 32){
                answer += s.charAt(i);
            }
            else if(s.charAt(i) + n>90 && s.charAt(i)<= 90){
                answer +=(char)(((s.charAt(i) + n) - 90) +64);
            }
            else if(s.charAt(i) + n>122 && s.charAt(i)>= 97){
                answer +=(char)(((s.charAt(i) + n) - 122) +96);
            }
            else 
                answer += (char)(s.charAt(i) + n);
                
        }
        return answer;
    }
}
