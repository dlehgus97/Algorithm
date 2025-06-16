import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[6];

        int result_1 = 0;
        int result_2 = 0;
        int result_3 = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % T == 0) {
                result_1 += arr[i] / T;
            } else {
                result_1 += (arr[i] / T) + 1;
            }
        }

        result_2 = (N / P);
        result_3 = (N % P);

        System.out.println(result_1);
        System.out.print(result_2 + " " + result_3);
    }
}