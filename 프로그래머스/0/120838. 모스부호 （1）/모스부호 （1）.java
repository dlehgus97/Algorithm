class Solution {
    public String solution(String letter) {
        String answer = "";
        String [] arr = letter.split(" ");
        String[] mos = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        for(int i = 0 ; i<arr.length; i++){
            for(int j = 0 ; j<mos.length; j++){
                if(arr[i].equals(mos[j])){
                    answer += (char)(j+97);
                }
            }
        }
        return answer;
    }
}