import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int result = 0;

        int[][] arr = new int[2][7];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            int S = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());

            arr[S][Y]++;
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j <= 6; j++) {
                if (arr[i][j] % K == 0) {
                    result += arr[i][j] / K;
                } else {
                    result += arr[i][j] / K + 1;
                }
            }
        }
        System.out.println(result);
    }
}