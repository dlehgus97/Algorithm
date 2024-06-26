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

        int[][] arr = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            int sum = 0;
            for (int j = 1; j <= N; j++) {
                int num = Integer.parseInt(st.nextToken());
                sum += num;
                arr[i][j] += sum;
            }
        }
        
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int result = 0;
            st = new StringTokenizer(br.readLine());
            int y1 = Integer.parseInt(st.nextToken());
            int x1 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            for (int j = y1; j <= y2; j++) {
                result += arr[j][x2] - arr[j][x1 - 1];
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
