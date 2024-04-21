import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long []dp = new long[1000002];
        dp[1]= 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i = 4 ; i<1000001; i++){
            for(int j =i-3; j<i; j++){
                dp[i] +=dp[j] % 1000000009;
                dp[i] %= 1000000009;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i<N; i++){
            int A =Integer.parseInt(br.readLine());
            sb.append(dp[A]).append("\n");
        }
        System.out.println(sb);
    }
}