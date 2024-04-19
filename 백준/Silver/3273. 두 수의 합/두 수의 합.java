import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int x = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;
        int result = 0;

        while (left < right) {
            int tmp = arr[left] + arr[right];
            if (tmp < x) {
                left++;
            } else if (tmp > x) {
                right--;
            } else {
                result++;
                left++; 
                right--; 
            }
        }

        System.out.println(result);
    }
}