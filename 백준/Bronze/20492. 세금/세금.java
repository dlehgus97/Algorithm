import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.print(N / 100 * 78 + " ");
        System.out.print(N / 100 * 80 + (N / 100 * 20) / 100 * 78);
    }
}