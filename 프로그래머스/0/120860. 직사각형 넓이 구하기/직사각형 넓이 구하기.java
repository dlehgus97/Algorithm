class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int tmp1 = Integer.MIN_VALUE;
        int tmp2 = Integer.MIN_VALUE;

        
        for(int i = 0 ; i<dots.length; i++){
            for(int j = i+1; j < dots.length; j++){
                if(Math.abs(dots[j][0] - dots[i][0]) >tmp1){
                    tmp1 = Math.abs(dots[j][0] - dots[i][0]);
                }
                if(Math.abs(dots[j][1] - dots[i][1]) > tmp2){
                    tmp2 = Math.abs(dots[j][1] - dots[i][1]);
                }
            }
        }
        
        answer = tmp1 * tmp2 ;
        return answer;
    }
}