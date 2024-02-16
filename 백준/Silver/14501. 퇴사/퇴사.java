import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int [] arr_1 = new int[N];
        int [] arr_2 = new int[N];

        for(int i = 0 ; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr_1[i] = Integer.parseInt(st.nextToken());
            arr_2[i] = Integer.parseInt(st.nextToken());
        }

        int [] dp = new int[N+1];

        for(int i = 0 ; i<N; i++){
            if(i+arr_1[i]<=N){
                dp[i+arr_1[i]] = Math.max(dp[i+arr_1[i]],dp[i]+ arr_2[i]);
            }
            dp[i+1] = Math.max(dp[i+1],dp[i]); // 그래야 게속 숫자를 가져갈수 있다
        }
        System.out.println(dp[N]);
    }
}