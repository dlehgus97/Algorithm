class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int num1 = 0;
        int num2 = 0;
        
        for(int i = 0 ; i<3; i++){
            if(dots[i][0] != dots[i+1][0]){
                num1 = dots[i][0];
                num2 = dots[i+1][0];
            }
        }
        int result1 = Math.abs(num1 - num2);
        for(int i = 0 ; i<3; i++){
            if(dots[i][1] != dots[i+1][1]){
                num1 = dots[i][1];
                num2 = dots[i+1][1];
            }
        }
        int result2 = Math.abs(num1 - num2);
        answer = result1 * result2 ;
        return answer;
    }
}
