import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[M + 1][M + 1];

        for (int i = 1; i <=M; i++) {
            st = new StringTokenizer(br.readLine());

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }


        int [][] dp = new int[M+1][N+1];

        for(int i = 1 ; i<=M ; i++){
            for(int j = 1; j<=N; j++){
                int check = j - arr[i][0];
                if(check>=0){
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i-1][check] + arr[i][1]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println(dp[M][N]);
    }
}