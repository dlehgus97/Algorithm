import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0 ;
        String str ;
        while((str =br.readLine()) != null ){
            StringTokenizer st = new StringTokenizer(str, " ");
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            result = N;
            int tmp ;
            int sum  = 0;
            while (N>=K) {
                tmp = N/K;
                sum = N % K;
                N = tmp + sum ;
                result += tmp;
            }
            System.out.println(result);
        }
    }
}
