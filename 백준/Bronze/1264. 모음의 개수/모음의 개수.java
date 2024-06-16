import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();
            if (str.equals("#")) {
                break;
            }
            
            str = str.replaceAll("[aeiouAEIOU]", "-");

            int result = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '-') {
                    result++;
                }
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
