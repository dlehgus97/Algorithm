import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    static BigInteger[] dp = new BigInteger[10001];

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        System.out.println(fib(N));
    }
    
    public static BigInteger fib(int n){
        dp[0] = new BigInteger("0");
        dp[1] = new BigInteger("1");

        for(int i = 2 ; i<=n; i++){
            dp[i] = dp[i-2].add(dp[i-1]);
        }
        return dp[n];
    }
}