

class Solution {
    public long solution(int n) {
        long answer = fib(n);
        return answer;
    }
    
    public static long fib(int a){
        long [] dp = new long [100001]; 
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i<100001; i++){
            dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
        }
        return dp[a];
    }
}