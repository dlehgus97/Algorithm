import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String str = Integer.toBinaryString(Integer.parseInt(br.readLine()));

            int result = 0;
            for (int j = str.length() - 1; j >= 0; j--) {
                if (str.charAt(j) == '1') {
                    System.out.print(result + " ");
                }
                result++;
            }
            System.out.println();
        }
    }
}
