import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static Character[][] arr;
    public static boolean[][] check;
    public static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new Character[N][M];
        check = new boolean[N][M];

        for (int i = 0; i < arr.length; i++) {
            String str = br.readLine();
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (!check[i][j]) {
                    if (arr[i][j] == '-') {
                        dfs(i, j, 1);
                    } else {
                        dfs(i, j, 2);
                    }
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void dfs(int a, int b, int c) {
        check[a][b] = true;

        if (c == 1) {
            b++;
            if (b < M && arr[a][b] == '-') {
                dfs(a, b, 1);
            }
        } else if (c == 2) {
            a++;
            if (a < N && arr[a][b] == '|') {
                dfs(a, b, 2);
            }
        }
    }
}