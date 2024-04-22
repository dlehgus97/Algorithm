import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        BigInteger [] dp = new BigInteger[36];
        dp[0] = BigInteger.ONE;
        dp[1] = BigInteger.ONE;

        for(int i = 2 ; i<36; i++){
            dp[i] = BigInteger.ZERO;
            for(int j = 0 ; j<i; j++){
                dp[i] = dp[i].add(dp[j].multiply(dp[i - j - 1]));
            }
        }

        System.out.println(dp[N]);
    }
}