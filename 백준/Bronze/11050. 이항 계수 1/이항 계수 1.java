import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int up = 1 ;
        int down = 1;

        for(int i = N ; i>N-K; i--){
            up *= i;
        }
        for(int i = K ; i>=1; i--){
            down *= i;
        }
        System.out.println(up/down);
    }
}