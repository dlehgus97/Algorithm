import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );

        int T = Integer.parseInt(br.readLine());

        int [][] arr = new int[15][15];

        for(int i = 0 ; i<arr.length; i++){
            arr[0][i] = i;
        }

        for(int i = 1 ; i<arr.length; i++){
            for(int j = 1 ; j<arr.length; j++){
                arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<T; i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(arr[k][n]).append("\n");
        }
       System.out.println(sb);
    }
}