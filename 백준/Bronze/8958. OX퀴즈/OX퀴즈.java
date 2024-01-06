import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            int result = 0;
            int score = 1;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    result += score;
                    score++;
                } else
                    score = 1;
            }
            System.out.println(result);
        }
    }
}