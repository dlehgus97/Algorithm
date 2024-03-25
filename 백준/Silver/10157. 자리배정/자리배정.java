import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int C = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        int [] dx = {1,0,-1,0};
        int [] dy = {0,1,0,-1};
        int [][] arr = new int[R][C];
        boolean [][] check = new boolean[R][C];



        if(C * R < K){
            System.out.println(0);
        }
        else{
            int x = 0;
            int y = R - 1;
            int dir = 3;
            int result = 1;

            for(int i = 0 ; i<C * R ; i++){
                arr[y][x] = result;
                check[y][x] = true;

                int nx = x + dx[dir];
                int ny = y + dy[dir];


                if (nx < 0 || nx >= C || ny < 0 || ny >= R || check[ny][nx]) {
                    dir = (dir + 1) % 4;
                    nx = x + dx[dir];
                    ny = y + dy[dir];
                }
                x = nx;
                y = ny;
                result ++;

            }
        }

        for(int i = 0 ; i<R; i++){
            for(int j = 0 ; j<C; j++){
                if(arr[i][j] == K){
                    sb.append(j+ 1).append(" ").append(R - i);
                }
            }
        }
        System.out.println(sb);
    }
}