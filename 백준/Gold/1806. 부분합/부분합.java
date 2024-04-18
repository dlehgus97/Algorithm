import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int end = 0;
        int result = 0;
        int minLength = Integer.MAX_VALUE;

        StringBuilder sb = new StringBuilder();

        while (start <= N && end <= N) {
            if (result >= M) {
                minLength = Math.min(minLength, end - start);
            }
            if (result < M) {
                result += arr[end];
                end++;
            } else {
                result -= arr[start];
                start++;
            }
        }
        if (minLength == Integer.MAX_VALUE) {
            sb.append(0);
        } else {
            sb.append(minLength);
        }
        System.out.println(sb);
    }
}