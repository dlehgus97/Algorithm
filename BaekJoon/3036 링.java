import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String []args ) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb= new StringBuilder();

        for(int i = 0 ; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 1 ; i<N; i++){
            int result =  gcd(arr[0],arr[i]);
            sb.append(arr[0]/result).append("/").append(arr[i]/result).append("\n");
        }
        System.out.println(sb);


    }
    static int gcd(int a ,int b){
        if(b== 0){
            return a;
        }
        return gcd(b,a%b);
    }
}
