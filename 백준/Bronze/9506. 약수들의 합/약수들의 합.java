import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == -1) {
                break;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(N).append(" = ");

            int result = 0;

            for (int i = 1; i <= N / 2; i++) {
                if (N % i == 0) {
                    result += i;
                    sb.append(i).append(" + ");
                }
            }
            if (result == N) {
                sb.setLength(sb.length() - 3);
                sb.append("\n");
                System.out.print(sb);
            } else {
                System.out.println(N + " is NOT perfect.");
            }

        }
    }
}
