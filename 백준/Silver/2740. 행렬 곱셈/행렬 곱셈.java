import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [][] arr1 = new int[N][M];

        for(int i = 0 ; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<M; j++){
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int [][] arr2 = new int[A][B];

        for(int i = 0 ; i<A; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j<B; j++){
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int [][] result = new int[N][B];

        for(int i = 0 ; i<N; i++){
            for(int j = 0 ; j<B; j++){
                for(int k = 0 ; k<M; k++){
                  result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        for(int i = 0; i<N; i++){
            for(int j = 0 ; j<B; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}