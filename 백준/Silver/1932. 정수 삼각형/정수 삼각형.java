import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long[][] arr = new long [N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= i; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        long[][] dp = new long[N][N];

        dp[0][0] = arr[0][0];
        long result = dp[0][0];

        for (int i = 1; i < N; i++) {
            dp[i][0] += dp[i - 1][0] + arr[i][0];
            dp[i][i] += dp[i - 1][i - 1] + arr[i][i];
            result = Math.max(Math.max(result,dp[i][0]) , dp[i][i]);
        }

        for (int i = 2; i < N; i++) {
            for (int j = 1; j <= i - 1; j++) {
                dp[i][j] = Math.max(dp[i - 1][j - 1] + arr[i][j], dp[i - 1][j] + arr[i][j]);
                result = Math.max(result, dp[i][j]);
            }
        }
        System.out.println(result);
    }
}