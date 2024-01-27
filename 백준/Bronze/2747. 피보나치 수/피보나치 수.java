import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        long result = 1;
        long fib1 = 0;
        long fib2 = 1;


        for(int i = 1; i<N; i++){
            result = fib1 + fib2;
            fib1 = fib2;
            fib2 = result;
        }
        sb.append(result);
        System.out.println(sb);
    }
}