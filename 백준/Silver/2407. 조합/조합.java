import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        BigInteger num1 = BigInteger.ONE;
        BigInteger num2 = BigInteger.ONE;

        for(int i = n; i>n-m; i--){
            num1 = num1.multiply(new BigInteger(Integer.toString(i)));
        }
        
        for(int i = 1 ; i<=m; i++){
            num2 = num2.multiply(new BigInteger(Integer.toString(i)));
        }
        
        System.out.println(num1.divide(num2));
    }
}