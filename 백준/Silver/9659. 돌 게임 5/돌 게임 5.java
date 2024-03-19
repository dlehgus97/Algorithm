import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        BigInteger bigInteger = new BigInteger(str);
        BigInteger num = new BigInteger("2");
        BigInteger answer = new BigInteger("0");

        if(!bigInteger.mod(num).equals(answer)){
            System.out.println("SK");
        }
        else{
            System.out.println("CY");
        }
    }
}