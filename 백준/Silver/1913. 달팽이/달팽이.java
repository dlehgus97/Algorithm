import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        int[] dy = {1, 0, -1, 0};
        int[] dx = {0, 1, 0, -1};

        int[][] arr = new int[N][N];
        boolean[][] check = new boolean[N][N];

        int num = (int) Math.pow(N, 2);
        int x = 0;
        int y = 0;
        int way = 0;

        while (num > 0) {

            arr[y][x] = num;
            check[y][x] = true;
            num--;

            if (x + dx[way] < 0 || x + dx[way] >= N || y + dy[way] < 0 || y + dy[way] >= N || check[y + dy[way]][x + dx[way]] == true) {
                way++;
                way %= 4;
            }
            x = x + dx[way];
            y = y + dy[way];
        }

        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sb.append(arr[i][j] + " ");
                if (arr[i][j] == K) {
                    sb2.append(i+ 1).append(" ").append(j + 1);
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
        System.out.print(sb2);
    }
}