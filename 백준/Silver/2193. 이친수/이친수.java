import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static long [] dp = new long[91];
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(dp(N));
    }
    public static long dp(int n){
        if(n>1){
            dp[1] = 1;
            dp[2] = 1;
        }
        else {
            return 1;
        }

        for(int i = 3 ; i<=n; i++){
            dp[i] = (dp[i - 1] + dp[i - 2]);
        }
        return dp[n];
    }
}