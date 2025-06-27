import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double result = Double.parseDouble(st.nextToken());

            while (st.hasMoreTokens()) {
                String str = st.nextToken();
                if (str.equals("@")) {
                    result *= 3;
                } else if (str.equals("%")) {
                    result += 5;
                } else if (str.equals("#")) {
                    result -= 7;
                }
            }
            System.out.printf("%.2f\n", result);

        }
    }
}