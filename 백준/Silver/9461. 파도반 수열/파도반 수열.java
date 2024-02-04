import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        long [] dp = new long[101];

        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;

        for(int i = 4 ; i <=100; i++){
            dp[i] = dp[i-2] + dp[i-3];
        }

        for(int i = 0 ; i<N; i++){
            int num = Integer.parseInt(br.readLine());
            sb.append(dp[num]).append("\n");
        }
        System.out.println(sb);
    }
}