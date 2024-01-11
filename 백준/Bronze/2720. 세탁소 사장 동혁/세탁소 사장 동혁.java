import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        
        for(int i = 0 ; i<N; i++){
            int [] arr = {0,0,0,0};
            int [] pri = {25,10,5,1};
            int A = Integer.parseInt(br.readLine());

            for(int j = 0 ; j<arr.length; j++){
                if(A / pri[j]>0){
                    arr[j] += A / pri[j];
                    A -=  pri[j] * arr[j];
                    sb.append(arr[j]).append(" ");
                }
                else {
                    sb.append(0).append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

