import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        long sqrt_N = (long) Math.sqrt(n);

        if (sqrt_N * sqrt_N <n) {
            sqrt_N ++;
        }
        System.out.println(sqrt_N);
        
    }
}
