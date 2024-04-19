import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] primes = new int[N + 1];
        int index = 0;
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                primes[index++] = i;
            }
        }

        int start = 0;
        int end = 0;

        int total = 0;
        int result = 0;

        while (end <= index) {
            if (total < N) {
                total += primes[end++];
            } else if (total > N) {
                total -= primes[start++];
            } else {
                total += primes[end++];
                result++;
            }
        }

        System.out.println(result);
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
