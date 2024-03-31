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

        char[][] arr = new char[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        int[][] ans = new int[N][M];

        for (int i = 0; i < N; i++) {
            boolean check = false;
            int num = 0;
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == '.' && check == false) {
                    ans[i][j] = -1;
                } else if (arr[i][j] == '.' && check == true) {
                    num++;
                    ans[i][j] = num;
                } else {
                    num = 0;
                    ans[i][j] = num;
                    check = true;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}