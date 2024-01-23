import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int result = 0 ;

        if(N<100){
            result += N;
        }
        else {
            result +=99;
            for(int i = 100; i<=N; i++){
                int A = i / 100;
                int B = (i / 10) % 10 ;
                int C = i % 10;
                if(B - A == C - B){
                    result ++;
                }
            }
        }
        System.out.println(result);
    }
}