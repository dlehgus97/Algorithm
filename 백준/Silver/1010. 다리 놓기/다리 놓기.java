import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int [][] dp = new int[30][30];
        for(int i = 1 ; i<30; i++){
            dp[i][0] = 1;
            dp[i][i] = 1;
        }

        for(int i = 2; i<30; i++){
            for(int j = 1; j<i; j++){
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }

        for(int i = 0 ; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            System.out.println(dp[B][A]);
        }
    }
}