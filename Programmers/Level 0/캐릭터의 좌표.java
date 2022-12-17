class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] result ={0 , 0};
        for(int i = 0 ; i<keyinput.length; i++){
            if(keyinput[i].equals("left")){
                result[0]--;
            }
            else if(keyinput[i].equals("right")){
                result[0]++;
            }
            else if(keyinput[i].equals("up")){
                result[1]++;
            }else if(keyinput[i].equals("down")){
                result[1]--;
            }
            if(result[0] == (board[0]/2)+1){
                result[0] =  board[0]/2;
                }
            else if (result[0] == (-1 * (board[0]/2))-1){
                result[0] = -1 * (board[0]/2);
            }
            if (result[1] == (board[1]/2)+1){
                result[1] =  board[1]/2;
            }
             else if (result[1] == (-1 * (board[1]/2))-1){
                result[1] = -1 * (board[1]/2);
            }
        }
        return result;
    }
}

//코드가 너무 지저분해서 다른 사람 코드를 참고 하였다. 삼항연산자를 통해 쉽게 계산 하였음
class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] result ={0 , 0};
        for(int i = 0 ; i<keyinput.length; i++){
            if(keyinput[i].equals("left")){
                result[0] -= result[0]>-(board[0]/2) ? 1 : 0;
            }
            else if(keyinput[i].equals("right")){
                result[0] += result[0]< (board[0]/2) ? 1 : 0;
            }
            else if(keyinput[i].equals("up")){
                result[1] += result[1]<(board[1]/2) ? 1 : 0;
            }else if(keyinput[i].equals("down")){
                result[1] -= result[1]>-(board[1]/2) ? 1 : 0;
            }
            
        }
        return result;
    }
}

