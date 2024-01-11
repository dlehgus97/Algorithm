import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int maxX = 0;
        int maxY = 0;

        StringTokenizer st;

        int [] num_1 = new int[N];
        int [] num_2 = new int[N];

        for(int i = 0 ; i<N; i++){
            st = new StringTokenizer(br.readLine());
            num_1[i] = Integer.parseInt(st.nextToken());
            num_2[i] = Integer.parseInt(st.nextToken());
            if(num_1[i]>maxX){
                maxX =num_1[i];
            }
            if(num_2[i]>maxY){
                maxY = num_2[i];
            }
        }
        boolean [][] arr= new boolean[maxY+11][maxX+11];

        for(int i = 0 ; i<N; i++){
            for(int j = num_2[i] ; j<num_2[i]+10; j++){
                for(int k = num_1[i]; k<num_1[i]+10; k++){
                    arr[j][k] = true;
                }
            }
        }
        int result = 0;

        for(int i = 0 ; i<arr.length; i++){
            for(int j = 0 ; j<arr[i].length; j++){
                if(arr[i][j] == true){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}

