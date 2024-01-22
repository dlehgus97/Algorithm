import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0 ; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int [] arr = new int[num] ;

            long result = 0 ;

            for(int j = 0 ; j<num; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            for(int j = 0 ; j<arr.length; j++){
                for(int k = j+1; k<arr.length; k++){
                   result += gcd(arr[j],arr[k]);
                }
            }
            System.out.println(result);
        }
    }
    public static long gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}