import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int result = 0;
        for (int i = 0; i < 9; i++) {
            result += Integer.parseInt(br.readLine());
        }

        System.out.println(num - result);
    }
}