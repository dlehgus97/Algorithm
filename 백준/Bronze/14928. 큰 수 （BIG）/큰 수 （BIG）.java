import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int result = 0;
        
        // Biginteger 오류 발생

        for (int i = 0; i < str.length(); i++) {
            result = (int) (((long) result * 10 + (str.charAt(i) - '0')) % 20000303);
        }
        System.out.println(result);
    }
}