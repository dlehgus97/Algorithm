import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str_1 = br.readLine();
        String str_2 = br.readLine();

        boolean[] arr_1 = new boolean[str_1.length()];
        boolean[] arr_2 = new boolean[str_2.length()];

        int result = 0;

        for (int i = 0; i < arr_1.length; i++) {
            for (int j = 0; j < arr_2.length; j++) {
                if (str_1.charAt(i) == str_2.charAt(j) && !arr_1[i] && !arr_2[j]) {
                    arr_1[i] = true;
                    arr_2[j] = true;
                    break;
                }
            }
        }
        for (int i = 0; i < arr_1.length; i++) {
            if (!arr_1[i]) {
                result++;
            }
        }
        for (int i = 0; i < arr_2.length; i++) {
            if (!arr_2[i]) {
                result++;
            }
        }
        System.out.println(result);
    }
}