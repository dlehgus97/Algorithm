import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            // 현재까지의 부분합과 현재 인덱스의 값을 더한 값을 비교하여 최대값 갱신
            sum = Math.max(arr[i], sum + arr[i]);
            // 최대값 갱신
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}
