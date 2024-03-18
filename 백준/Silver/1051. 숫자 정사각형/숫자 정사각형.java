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

        int[][] arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        int result = 0;
        int size = Math.min(N, M) ;


        boolean check = false;
        while (size != 1) {
            for (int i = 0; i <= N - size; i++) {
                for (int j = 0; j <= M - size; j++) {
                    if (arr[i][j] == arr[i][j + size - 1] && arr[i][j] == arr[i + size - 1][j] && arr[i][j] == arr[i + size - 1][j + size - 1]) {
                        check = true;
                        break;
                    }
                }
                if (check) {
                    result = size * size;
                    break;
                }

                }
                if(check){
                    break;
            }
                size--;
        }
        
        if(result == 0){
            result = 1;
        }
        System.out.println(result);
    }
}