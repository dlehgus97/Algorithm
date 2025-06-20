import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[7];

        int result_1 = 0;
        int result_2 = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] % 2 != 0) {
                result_1 += arr[i];
            }
        }
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result_2 = arr[i];
                break;
            }
        }

        if (result_1 == 0) {
            System.out.println(-1);
        } else {
            System.out.println(result_1);
            System.out.println(result_2);
        }
    }
}