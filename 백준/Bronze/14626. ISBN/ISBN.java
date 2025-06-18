import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int tmp = 0;
        int tmp_num = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                if (i % 2 == 0) {
                    tmp_num = 1;
                } else {
                    tmp_num = 3;
                }
            } else {
                if (i % 2 == 0) {
                    tmp += str.charAt(i) - 48;
                } else {
                    tmp += (str.charAt(i) - 48) * 3;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            if ((tmp + (tmp_num * i)) % 10 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}