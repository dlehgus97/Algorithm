import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int tmp = 0;
            for (int j = 0; j < 4; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (num == 1) {
                    tmp++;
                }
            }
            if (tmp == 0) {
                System.out.println("D");
            } else if (tmp == 1) {
                System.out.println("C");
            } else if (tmp == 2) {
                System.out.println("B");
            } else if (tmp == 3) {
                System.out.println("A");
            } else {
                System.out.println("E");
            }
        }
    }
}