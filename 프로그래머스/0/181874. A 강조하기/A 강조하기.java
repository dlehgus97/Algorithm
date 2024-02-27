class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i = 0 ; i<myString.length(); i++){
            char word = myString.charAt(i);
            if(word == 'a' || word == 'A'){
                answer += Character.toUpperCase(word);
            }
            else if(word == ' '){
                answer += " ";
            }
            else{
                answer += Character.toLowerCase(word);
            }
        }
        return answer;
    }
}