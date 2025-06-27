import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int maxResult = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int result = 0;
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            if (A == B && B == C && C == A) {
                result = 10000 + A * 1000;
            } else if (A == B && B != C) {
                result = 1000 + A * 100;
            } else if (A == C && B != A) {
                result = 1000 + A * 100;
            } else if (B == C && C != A) {
                result = 1000 + B * 100;
            } else if (A != B && B != C && C != A) {
                result = Math.max(A,Math.max(B,C)) * 100;
            }
            maxResult = Math.max(result, maxResult);
        }
        System.out.println(maxResult);
    }
}