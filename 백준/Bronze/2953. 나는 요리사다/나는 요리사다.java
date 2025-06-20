import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = -1;
        int maxTeam = 0;

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int tmp_result = 0;
            for (int j = 0; j < 4; j++) {
                tmp_result += Integer.parseInt(st.nextToken());
            }
            if (tmp_result > max) {
                max = tmp_result;
                maxTeam = i + 1;
            }
        }
        System.out.println(maxTeam + " " + max);
    }
}