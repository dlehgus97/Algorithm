class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int [2];
        
        for(int i = 0 ; i<keyinput.length; i++){
            if(keyinput[i].equals("left")){
                if(answer[0] == -1 * board[0] / 2){
                    answer[0] = -1 * board[0] / 2;
                }
                else{
                    answer[0]--; 
                }   
            }
            else if(keyinput[i].equals("right")){
                if(answer[0] == 1 * board[0] / 2){
                    answer[0] = 1 * board[0] / 2;
                }
                else{
                    answer[0]++; 
                }
            }
            else if(keyinput[i].equals("up")){
                if(answer[1] == 1 * board[1] / 2){
                    answer[1] =  1 * board[1] / 2;
                }
                else{
                    answer[1]++; 
                }
            }
            else if(keyinput[i].equals("down")){
                if(answer[1] == -1 * board[1] / 2){
                    answer[1] = -1 * board[1] / 2;
                }
                else{
                    answer[1]--; 
                }
            }
        }
        return answer;
    }
}