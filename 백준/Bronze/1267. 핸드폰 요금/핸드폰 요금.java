import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int Y = 0;
        int M = 0;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            Y += (num / 30) + 1;
            M += (num / 60) + 1;
        }
        int result_1 = 10 * Y;
        int result_2 = 15 * M;

        if (result_1 < result_2) {
            System.out.println("Y " + result_1);
        } else if (result_1 > result_2) {
            System.out.println("M " + result_2);
        } else {
            System.out.println("Y M " + result_1);
        }
    }
}