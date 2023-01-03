import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N];
        int [] num = new int[2];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0 ;i<2; i++){
            num[i] = Integer.parseInt(st2.nextToken());
        }

        long result = 0 ;
        for(int i = 0 ; i<N; i++){
            if(arr[i]<num[0]){
                result ++;
            }
            else{
                arr[i] -= num[0];
                result ++;
                
            if(arr[i] % num[1] == 0){
                result += arr[i]/num[1];
            }
            else {
                result += (arr[i] / num[1]) + 1;
            }
        }
        }
        System.out.println(result);

    }
}
