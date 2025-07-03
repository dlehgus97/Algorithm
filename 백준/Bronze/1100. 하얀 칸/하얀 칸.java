import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tmp = 0;
        int result = 0;
        for (int i = 0; i < 8; i++) {
            String str = br.readLine();
            if (tmp % 2 == 0) {
                for (int j = 0; j < str.length(); j += 2) {
                    if (str.charAt(j) == 'F') {
                        result++;
                    }
                }
            } else {
                for (int j = 1; j < str.length(); j += 2) {
                    if (str.charAt(j) == 'F') {
                        result++;
                    }
                }
            }
            tmp++;
        }
        System.out.println(result);
    }
}