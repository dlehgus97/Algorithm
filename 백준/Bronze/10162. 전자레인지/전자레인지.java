import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = {300, 60, 10};

        StringBuilder sb = new StringBuilder();

        if (N % 10 != 0) {
            sb.append(-1);
            
        } else {
            for (int i = 0; i < 3; i++) {
                int result = 0;

                result += N / arr[i];

                sb.append(result + " ");
                N %= arr[i];
            }
        }
        System.out.println(sb);
    }
}
