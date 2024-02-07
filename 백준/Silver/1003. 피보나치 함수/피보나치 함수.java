import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int [] dp0 = new int[41];
        int [] dp1 = new int[41];

        dp0[0] = 1;
        dp0[1] = 0;
        dp1[0] = 0;
        dp1[1] = 1;

        for(int i = 2 ; i<41; i++){
            dp0[i] = dp0[i-2] + dp0[i-1];
            dp1[i] = dp1[i-2] + dp1[i-1];
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<N; i++){
            int num = Integer.parseInt(br.readLine());
            sb.append(dp0[num] + " " + dp1[num]).append("\n");
        }
        System.out.println(sb);
    }
}