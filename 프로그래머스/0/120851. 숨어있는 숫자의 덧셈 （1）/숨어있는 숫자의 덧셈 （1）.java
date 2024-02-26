class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String word = my_string.replaceAll("[a-zA-Z]","-");
        
        for(int i = 0; i<word.length(); i++){
            if(word.charAt(i) !='-'){
                answer += (int)word.charAt(i) - 48;
            }
        }
        return answer;
    }
}