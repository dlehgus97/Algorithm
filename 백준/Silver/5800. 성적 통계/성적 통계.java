import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int[] arr = new int[M];
            for (int j = 0; j < M; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            int max = arr[M - 1];
            int min = arr[0];
            int gapMax = Integer.MIN_VALUE;
            for (int j = 0; j < M - 1; j++) {
                int gap = arr[j + 1] - arr[j];
                if (gap > gapMax) {
                    gapMax = gap;
                }
            }
            System.out.println("Class " + i);
            System.out.println("Max " + max + ", Min " + min + ", Largest gap " + gapMax);
        }
    }
}
