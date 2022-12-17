class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String [quiz.length];
            for(int i = 0 ; i<quiz.length; i++){
                int result = 0 ;
                String [] word = quiz[i].split(" ");
                if(word[1].equals("+")){
                    result = Integer.parseInt(word[0]) + Integer.parseInt(word[2]);
                }
                else {
                    result = Integer.parseInt(word[0]) - Integer.parseInt(word[2]);
                }
                if(result == Integer.parseInt(word[4])){
                    answer[i] = "O";
                }
                else
                    answer[i] = "X";
            }
        return answer;
    }
}
