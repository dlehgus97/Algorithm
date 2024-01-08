import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N =  Integer.parseInt(br.readLine());

        int [] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0 ;

        for(int i = 0 ; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            int tmp = 0;
            for(int j = 1; j<=arr[i]; j++){
                if(arr[i] % j == 0){
                    tmp++;
                }
            }
            if(tmp == 2){
                result ++;
            }
        }
        System.out.println(result);
    }
}
