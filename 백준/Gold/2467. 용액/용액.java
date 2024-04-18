import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int one = 0;
        int two = arr.length - 1;
        int min = Integer.MAX_VALUE;
        int result1 = 0;
        int result2 = 0;


        while (one < two) {

            int num = Math.abs(arr[one] + arr[two]);

            if (num < min) {
                min = num;
                result1 = arr[one];
                result2 = arr[two];
            }

            if (Math.abs(arr[one]) < Math.abs(arr[two])) {
                two--;
            } else {
                one++;
            }
        }
        System.out.println(result1 + " " + result2);
    }
}
