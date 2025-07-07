import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int A = 0;
        int B = 0;

        for (int i = 0; i < N; i++) {
            if (str.charAt(i) == 'A') {
                A++;
            } else {
                B++;
            }
        }
        if (A > B) {
            System.out.println("A");
        } else if (A < B) {
            System.out.println("B");
        } else {
            System.out.println("Tie");
        }
    }
}