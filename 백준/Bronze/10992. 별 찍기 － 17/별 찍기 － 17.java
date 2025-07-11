import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            for (int j = N - i; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.print("*");

            if(i == 1){
                System.out.println();
            }
            else if (i == N) {
                for (int j = 0; j <2 * N - 2; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 0; j < 2 * (i - 1) - 1; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}