import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0 ;
        for(int i = 1; i<=N; i++){
            result = i;
            int tmp = i;
            while(tmp != 0){
                result += tmp % 10;
                tmp /= 10;
              }
            if(result == N) {
                result = i;
                break;
              }
            if(i == N){
                result = 0;
              }
        }
        System.out.println(result);
    }
}
