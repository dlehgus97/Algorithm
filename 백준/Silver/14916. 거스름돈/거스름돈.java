import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int result = 0;

        int num = N / 5;

        int tmp = 0;

        boolean possible = false;

        while (num >= tmp) {
            if (((N - ((num - tmp) * 5)) % 2) == 0) {
                possible = true;
                result += num - tmp;
                N -= (num - tmp) * 5;
                result += N / 2;
                break;
            }
            tmp++;
        }

        if (!possible || N == 1 || N == 3) { 
            System.out.println(-1);
        } else {
            System.out.println(result);
        }
    }
}
