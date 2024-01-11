import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            int[] arr = {A, B, C};

            Arrays.sort(arr);


            if (A + B + C == 0) {
                break;
            }
            
            if (arr[2] >= arr[0] + arr[1]) {
                System.out.println("Invalid");
            }
            else {
                if (A == B && B == C && C == A) {
                    System.out.println("Equilateral");
                } else if (A == B) {
                    System.out.println("Isosceles");
                } else if (B == C) {
                    System.out.println("Isosceles");
                } else if (C == A) {
                    System.out.println("Isosceles");
                }
                if (A != B && B != C && C != A) {
                    System.out.println("Scalene");
                }
            }
        }
    }
}
