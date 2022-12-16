class Solution {
    public String solution(String s) {
        int [] num = new int [26];
        String answer = "";
        for(int i = 0 ; i<s.length(); i++){
            num[s.charAt(i) -'a']++;
        }
        for(int i = 0 ; i<26; i++){
            if(num[i] == 1){
                answer += (char)(i+'a');
            }
        }
        
        return answer;
    }
}
