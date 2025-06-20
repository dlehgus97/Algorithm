import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n_1 = Integer.parseInt(st.nextToken());
        int k_1 = Integer.parseInt(st.nextToken());
        int n_2 = Integer.parseInt(st.nextToken());
        int k_2 = Integer.parseInt(st.nextToken());

        System.out.println(n_1 * k_1 + n_2 * k_2);
    }
}