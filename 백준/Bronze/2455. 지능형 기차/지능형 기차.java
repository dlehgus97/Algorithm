import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = -1;
        int people = 0;

        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            people -= Integer.parseInt(st.nextToken());
            people += Integer.parseInt(st.nextToken());
            if (max < people) {
                max = people;
            }
        }
        System.out.println(max);
    }
}