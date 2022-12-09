import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int [][] arr = new int[15][15];  // 

        for(int i = 0 ; i<=14; i++){
            arr[0][i] = i;  // 0층 i호
            arr[i][1] = 1;  // i층 1호
        }
      
        for(int i = 1; i<=14; i++){
            for(int j = 1; j<=14; j++){
                arr[i][j] = arr[i][j-1] + arr[i-1][j];
            }
        }
      
        for(int i = 0 ; i<T; i++){
            int A = Integer.parseInt(br.readLine());
            int B = Integer.parseInt(br.readLine());
            int result = 0 ;
            result = arr[A][B];
            System.out.println(result);
        }
    }
}


// int [][] arr는 아파트에 들어갈 인원이 고정이기 때문에 미리 구해놓는다.  


