class Solution {
    public int solution(int[][] board) {
        int answer = board.length * board.length;
        boolean [][] check = new boolean[board.length][board.length];
        
        for(int i = 0 ; i<board.length; i++){
            for(int j = 0 ; j<board.length; j++){
                if(board[i][j] == 1){
                    int num1 = i - 1;
                    int num2 = j - 1;
                    for(int k = 0; k<3; k++){
                        for(int l = 0 ; l<3; l++){
                            if(num1 + k >= 0 && num1 + k<board.length && num2 + l>= 0 && num2 + l<board.length){
                                check[num1 + k][num2 + l] = true;
                            }
                        }
                    }
                }
            }
        }
        
        for(int i = 0 ; i<check.length; i++){
            for(int j = 0 ; j<check[i].length ; j++){
                if(check[i][j]){
                    answer --;
                }
            }
        }
        return answer;
    }
}