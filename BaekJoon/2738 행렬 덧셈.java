import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void  main(String []args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int [][] arr1 = new int[N][M];
        int [][] arr2 = new int[N][M];
        for(int i = 0; i<N; i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for(int j = 0 ; j<M; j++){
                arr1[i][j] = Integer.parseInt(st1.nextToken());
            }

        }
        for(int i = 0; i<N; i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for(int j = 0 ; j<M; j++){
                arr2[i][j] = Integer.parseInt(st1.nextToken());
            }
        }
        for(int i = 0 ; i<N; i++){
            for(int j = 0 ; j<M; j++){
                System.out.print(arr1[i][j] + arr2[i][j] + " ");
            }
            System.out.println();
        }


    }
}

//3중 행렬로 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void  main(String []args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int [][][] arr = new int[2][N][M];
        for(int k = 0; k<2; k++) {
            for (int i = 0; i < N; i++) {
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                for (int j = 0; j < M; j++) {
                    arr[k][i][j] = Integer.parseInt(st1.nextToken());
                }
            }
        }

        for(int i = 0 ; i<N; i++){
            for(int j = 0 ; j<M; j++){
                System.out.print(arr[0][i][j] +arr[1][i][j] + " ");
            }
            System.out.println();

        }

    }
}
