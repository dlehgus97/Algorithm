import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int []dp = new int[12];
        dp[1]= 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i = 4 ; i<12; i++){
            for(int j =i-3; j<i; j++){
                dp[i] +=dp[j];
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