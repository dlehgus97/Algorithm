class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String [] str = s.split("");
        answer[0] = -1;
        for(int i = 1 ; i<s.length(); i++){
            for(int j =i-1 ; j>=0; j--){
                if(str[i].equals(str[j])){
                    answer[i] = i - j;
                    break;
                }
                else 
                    answer [i] = -1;
            }
        }
        return answer;
    }
}
