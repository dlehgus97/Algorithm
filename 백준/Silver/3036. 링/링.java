import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        arr[0] = Integer.parseInt(st.nextToken());

        for (int i = 1; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            int tmp = gcd(arr[0], arr[i]);
            sb.append(arr[0] / tmp).append("/").append(arr[i] / tmp).append("\n");
        }
        System.out.println(sb);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
