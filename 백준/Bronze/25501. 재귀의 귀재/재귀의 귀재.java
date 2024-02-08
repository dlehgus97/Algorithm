import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            result = 0;
            sb.append(isPalindrome(word) + " ").append(result).append("\n");
        }
        System.out.println(sb);
    }

    public static int isPalindrome(String word) {
        return recursion(word,0,word.length() -1);
    }

    public static int recursion(String word, int l, int r) {
        result ++;
        if (l >= r) {
            return 1;
        } else if (word.charAt(l) != word.charAt(r)) {
            return 0;
        } else {
            return recursion(word,l+1,r-1);
        }
    }
}