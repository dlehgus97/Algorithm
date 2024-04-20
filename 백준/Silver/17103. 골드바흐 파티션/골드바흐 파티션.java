import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static boolean[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        isPrime(1000000);

        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int result = 0;
            int num = Integer.parseInt(br.readLine());
            for (int j = 2; j <= num / 2; j++) {
                if (!arr[j] && !arr[num - j]) {
                    result++;
                }
            }
            sb.append(result).append("\n");
        }
        System.out.print(sb);
    }

    public static void isPrime(int a) {
        arr = new boolean[a + 1];
        arr[0] = arr[1] = true;
        for (int i = 2; i * i <= a; i++) {
            if (!arr[i]) {
                for (int j = i * i; j <= a; j += i) {
                    arr[j] = true;
                }
            }
        }
    }
}
