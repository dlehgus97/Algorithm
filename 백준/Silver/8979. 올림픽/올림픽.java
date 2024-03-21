import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][4];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
            arr[i][3] = Integer.parseInt(st.nextToken());
        }

        int result = 1;

        int turn = 0;
        boolean [] check = new boolean[N+1];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i][0] == K){
                turn = i;
                break;
            }
        }

        for(int i = 1 ; i<4; i++){
            for(int j = 1 ; j<arr.length; j++){
                if(!check[j] && arr[turn][i]<arr[j][i]){
                    check[j] = true;
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}