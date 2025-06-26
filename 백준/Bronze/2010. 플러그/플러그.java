import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int plug = Integer.parseInt(br.readLine());
        int result = plug;

        for (int i = 1; i < N; i++) {
            plug = Integer.parseInt(br.readLine());
            result += plug - 1;
        }
        System.out.println(result);
    }
}