import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(br.readLine());
        int [][] arr = new int[Y][X];
        boolean [][] check = new boolean[Y][X];

        int[] dy = {0, 1, 0, -1};
        int[] dx = {1, 0, -1, 0};
        int result = 1;

        if (X * Y < N) {
            System.out.println(0);
        } else {
            int x = 0;
            int y = Y - 1;
            int dir = 3;

            for (int i = 0; i <X * Y; i++){
                arr[y][x] = result;
                check[y][x] = true;

                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if (nx < 0 || nx >= X || ny < 0 || ny >= Y || check[ny][nx]) {
                    dir = (dir + 1) % 4;
                    nx = x + dx[dir];
                    ny = y + dy[dir];
                }

                x = nx;
                y = ny;
                result++;
            }
        }
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i<Y ; i++){
            for(int j = 0 ; j<X; j++){
                if(arr[i][j] == N){
                   sb.append(j + 1 ).append(" ").append(Y - i);
                }
            }
        }
        System.out.println(sb);
    }
}