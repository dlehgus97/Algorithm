class Solution {
    public int solution(int[][] triangle) {
        int answer = triangle[0][0];
        
        int len = triangle.length;
        int [][] dp = new int [triangle.length][triangle.length];
        
        dp[0][0] = triangle[0][0];
        
        for(int i = 1; i<len ; i++){
            dp[i][0] = dp[i-1][0] + triangle[i][0];
            dp[i][i] = dp[i-1][i-1] + triangle[i][i];
            answer = Math.max(dp[i][0],dp[i][i]);
        }
        
       
        for(int i = 2 ; i<len; i++){
            for(int j = 1; j<= i - 1; j++){
                dp[i][j] = Math.max(dp[i-1][j-1]+ triangle[i][j] ,dp[i-1][j] + triangle[i][j]);
                answer = Math.max(answer,dp[i][j]);
            }
        }
    
        return answer;
    }
}