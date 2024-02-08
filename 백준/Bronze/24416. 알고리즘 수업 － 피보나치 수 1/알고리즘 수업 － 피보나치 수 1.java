import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] arr = new int[41];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        sb.append(fib(N) + " ").append(fibonacci(N));
        System.out.println(sb);
    }

    public static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static int fibonacci(int n) {
        int result = 0;
        arr[1] = 1;
        arr[2] = 1;
        for(int i = 3; i<=n; i++){
            arr[i] = arr[i-1] + arr[i-2];
            result++;
        }
        return result;
    }
}