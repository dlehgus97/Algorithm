import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());

        int language = 0;
        int math = 0;

        if (A % C == 0) {
            language = A / C;
        } else {
            language = A / C + 1;
        }

        if (A % C == 0) {
            math = B / D;
        } else {
            math = B / D + 1;
        }

        int max = L - Math.max(language, math);
        System.out.println(max);
    }
}