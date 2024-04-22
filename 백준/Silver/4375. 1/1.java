import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        String str;

        while ((str = br.readLine()) != null) {
            int n = Integer.parseInt(str);
            String word = "1";

            BigInteger bi = BigInteger.ZERO;
            BigInteger num = new BigInteger(Integer.toString(n));

            while(true) {
                bi = bi.multiply(BigInteger.TEN).add(BigInteger.ONE);  // * 10 + 1 씩증가 
                if (bi.mod(num).equals(BigInteger.ZERO)) {
                    sb.append(bi.toString().length()).append('\n');
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}