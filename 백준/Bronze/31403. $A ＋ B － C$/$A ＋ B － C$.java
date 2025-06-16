import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        String As = Integer.toString(A);
        String Bs = Integer.toString(B);
        String Cs = Integer.toString(C);

        int result1 = A + B - C;

        int result2 = Integer.parseInt(As + Bs) - C;

        System.out.println(result1);
        System.out.println(result2);
    }
}