import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        double[] arr = new double[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }

        double[] dp = new double[N];
        dp[0] = arr[0];

        double result = 0;

        for (int i = 1; i < N; i++) {
            dp[i] = Math.max(dp[i - 1] * arr[i], arr[i]);
            result = Math.max(result, dp[i]);
        }

        System.out.printf("%.3f\n", result);
    }
}
