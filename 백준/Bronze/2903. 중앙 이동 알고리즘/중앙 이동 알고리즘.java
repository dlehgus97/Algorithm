import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int tmp = 2;


        for(int i = 0 ; i<N; i++){
            tmp += Math.pow(2,i);
        }
        
        int result = tmp * tmp  ;
      
        System.out.println(result);
    }
}

