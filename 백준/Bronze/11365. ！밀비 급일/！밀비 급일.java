import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "";

        while (true) {
            str = br.readLine();
            if (str.equals("END")) {
                break;
            }

            StringBuilder sb = new StringBuilder();

            for (int i = str.length() - 1; i >= 0; i--) {
                sb.append(str.charAt(i));
            }
            System.out.println(sb);
        }
    }
}