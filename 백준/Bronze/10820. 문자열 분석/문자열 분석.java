import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        while ((str = br.readLine()) != null && !str.isEmpty()) {
            int result_1 = 0;
            int result_2 = 0;
            int result_3 = 0;
            int result_4 = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                    result_2++;
                } else if (str.charAt(i) >= 97) {
                    result_1++;
                } else if (str.charAt(i) == 32) {
                    result_4++;
                } else if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                    result_3++;
                }
            }
            System.out.println(result_1 + " " + result_2 + " " + result_3 + " " + result_4);
        }
    }
}