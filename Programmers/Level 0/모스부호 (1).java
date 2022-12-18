class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] word = letter.split(" ");
        
       String[] mos = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(int i = 0 ; i<word.length; i++){
            for(int j = 0 ; j<mos.length; j++){
                if(word[i].equals(mos[j])){
                    answer += (char)(j +'a'); 
                }
            }
            
        }
        return answer;
    }
}
