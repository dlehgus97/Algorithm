import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger A = new BigInteger(String.valueOf(br.readLine()));
        String str = br.readLine();
        BigInteger B = new BigInteger(String.valueOf(br.readLine()));

        if (str.equals("*")) {
            System.out.println(A.multiply(B));
        } else if (str.equals("+")) {
            System.out.println(A.add(B));
        }
    }
}