import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        int[] alp = new int[26];

        for (char s : str.toCharArray()) {
            alp[s - 'A']++;
        }

        int oddCount = 0;
        int oddIndex = -1;

        for (int i = 0; i < 26; i++) {
            if (alp[i] % 2 != 0) {
                oddCount++;
                oddIndex = i;
            }
        }

        if (oddCount > 1) {
            System.out.println("I'm Sorry Hansoo");
            return;
        }

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < alp[i] / 2; j++) {
                sb.append((char) (i + 'A'));
            }
        }

        StringBuilder result = new StringBuilder();
        result.append(sb);

        if (oddCount == 1) {
            result.append((char) (oddIndex + 'A'));
        }

        result.append(sb.reverse());
        System.out.println(result);
    }
}