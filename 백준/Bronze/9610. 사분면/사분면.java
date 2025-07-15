import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[5];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());

            if (X > 0 && Y > 0) {
                arr[0]++;
            } else if (X < 0 && Y > 0) {
                arr[1]++;
            } else if (X < 0 && Y < 0) {
                arr[2]++;
            } else if (X > 0 && Y < 0) {
                arr[3]++;
            } else if (X == 0 || Y == 0) {
                arr[4]++;
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("Q" + (i + 1) + ": " + arr[i]);
        }
        System.out.println("AXIS: " + arr[4]);
    }
}