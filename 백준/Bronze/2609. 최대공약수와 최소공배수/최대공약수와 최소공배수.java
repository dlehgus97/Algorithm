import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        if(B>A){
            int tmp = A;
            A = B;
            B = tmp;
        }
        int result_1 = gcd(A,B);
        int result_2 = (A * B) / result_1;
        
        System.out.println(result_1);
        System.out.println(result_2);
    }
    public static int gcd(int a , int b){
        if(b == 0) 
            return a;
        else 
            return gcd(b, a%b);
    }
}