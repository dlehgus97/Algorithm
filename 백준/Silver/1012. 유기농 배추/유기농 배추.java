import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] dy = {0, 1, 0, -1};
    static int[] dx = {1, 0, -1, 0};
    static int[][] arr;
    static boolean[][] check;
    static int N, M, K;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            arr = new int[N][M];
            check = new boolean[N][M];

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                arr[b][a] = 1;
            }

            int count = 0;

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (arr[j][k] == 1 && !check[j][k]) {
                        dfs(k, j);
                        count++;
                    }
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
    public static void dfs(int a, int b) {
        check[b][a] = true;

        for (int i = 0; i < 4; i++) {
            int x = a + dx[i];
            int y = b + dy[i];

            if (x >= 0 && x < M && y >= 0 && y < N && arr[y][x] == 1 && !check[y][x]) {
                dfs(x, y);
            }
        }
    }
}