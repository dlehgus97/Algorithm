import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int [] arr = new int[N];

        for(int i = 0 ; i<arr.length; i++){
            int num = Integer.parseInt(br.readLine());
            arr[i] = num ;
        }
        int [] gap = new int[N-1];
        int count = 0;

        for(int i = 0 ; i<gap.length; i++){
            gap[count] = arr[i+1] - arr[i];
            count++;
        }
        int sum = 0 ;

        for(int i =  0 ; i<gap.length; i++){
            sum = gcd(sum,gap[i]);
        }

        int result = 0 ;

        for(int i = arr[0]; i<=arr[N-1]; i += sum){
            result ++;
        }
        System.out.println(result - N);
    }
    public static int gcd(int n, int m){
        if(m == 0){
            return n;
        }
        else return gcd(m,n%m);
    }
}