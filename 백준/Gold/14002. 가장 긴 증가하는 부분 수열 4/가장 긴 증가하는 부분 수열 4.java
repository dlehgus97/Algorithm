import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N + 1];
        int[] dp = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0;
        
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            result = Math.max(result, dp[i]);
        }

        int num = result;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = dp.length - 1; i >= 0; i--) {
            if (dp[i] == num) {
                list.add(arr[i]);
                num--;
            }
            if (result == 0) {
                break;
            }
        }
        Collections.sort(list);

        System.out.println(result);

        for (int i = 1; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}