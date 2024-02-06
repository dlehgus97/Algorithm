import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N == 1) {
            System.out.println(0);
        } else {
            int[] arr = new int[N - 1];

            int num = Integer.parseInt(br.readLine());
            int result = 0;

            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }

            Arrays.sort(arr);

            while (true) {
                if (num <= arr[N - 2]) {
                    num++;
                    result++;
                    arr[N - 2]--;
                }
                Arrays.sort(arr);

                if (num > arr[N - 2]) {
                    break;
                }
            }
            System.out.println(result);
        }
    }
}