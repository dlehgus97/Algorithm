import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int [] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0 ;
        int tmp = 0;

        for(int i = 1 ; i<N; i++){
            if(arr[i]>arr[i-1]){
                tmp += arr[i] - arr[i-1];
            }
            else{
                if(result<tmp){
                    result = tmp;
                }
                tmp = 0;
            }
        }
        System.out.println(result>tmp ? result : tmp);
    }
}