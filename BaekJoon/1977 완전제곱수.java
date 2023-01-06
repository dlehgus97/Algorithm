import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int min = 10001;
        int result = 0;

        for (int i = 1; i <=100; i++) {
            if (i * i >= N && i * i <= M) {
                result += i * i;
                if (i * i < min) {
                    min = i * i;
                }
            }
            if (i * i > M) {
                break;
            }
        }
        if (result == 0) {
            System.out.println(-1);
        } 
        else {
            System.out.println(result);
            System.out.println(min);
        }
    }
}
