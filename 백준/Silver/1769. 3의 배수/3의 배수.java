import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();

        int count = 0;
        int result = 0;

        if (N.length() == 1) { 
            result = Integer.parseInt(N);
        } else { 
            while (true) {
                count++;
                result = 0;
                for (int i = 0; i < N.length(); i++) {
                    result += (int) (N.charAt(i) - '0');
                }
                if (result < 10) {
                    break;
                }
                N = Integer.toString(result);
            }
        }
        if (result % 3 == 0) {
            System.out.println(count);
            System.out.println("YES");
        } else {
            System.out.println(count);
            System.out.println("NO");
        }
    }
}
