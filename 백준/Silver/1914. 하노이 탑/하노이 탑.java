import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        BigInteger plus = new BigInteger("1");
        BigInteger result = new BigInteger("1");

        for(int i = 1 ; i<N; i++){
            plus = plus.multiply(new BigInteger("2"));
            result = result.add(plus);
        }
        System.out.println(result);
        if(N <= 20){
            hanoi(N,1,3);
            System.out.println(sb.substring(0,sb.length() - 1));
        }
    }

    public static void hanoi (int N , int X , int Y){
        if(N > 1){
            hanoi(N-1,X,6-X-Y);
        }
        sb.append(X).append(" ").append(Y).append("\n");
        if(N > 1){
            hanoi(N-1 , 6 - X - Y,Y);
        }
        }
}