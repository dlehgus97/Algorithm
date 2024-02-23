import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] dp = new int[50001];

        dp[0] = 0 ; dp[1] = 1;

        int N = Integer.parseInt(br.readLine());

        for(int i = 2; i<=N; i++){
            int min = Integer.MAX_VALUE;
            for(int j = 1; j*j <= i; j++){
                min = Math.min(min,dp[i - (j*j)]); //이렇게 하면 총 방법수를 다 구 할수 있다 .
            } // 그 중 제일 적은 횟수의 방법을 선택하여 
            dp[i] = min+1; // 가장 적은 방법보다 제곱수를 더해야 그 값이 나오는 것이기 때문에 
        }
        System.out.println(dp[N]);
    }
}