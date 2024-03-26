import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int N, M;
    public static int[] answer;
    public static int[] arr;

    public static boolean[] check;
    public static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        check = new boolean[N];
        answer = new int[M];
        arr = new int[N];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        sb = new StringBuilder();
        dfs(0);
        System.out.println(sb);
    }

    public static void dfs(int depth) {
        if (depth == M) {
            for (int a : answer) {
                sb.append(a).append(" ");
            }
            sb.append("\n");
            return;
        }

        int prev = 0; // 이전에 선택한 요소의 값
        for (int i = 0; i < arr.length; i++) {
            if (!check[i] && (prev != arr[i])) { // 이전에 선택한 요소와 같지 않고, 아직 선택되지 않은 경우에만 실행
                check[i] = true;
                answer[depth] = arr[i];
                dfs(depth + 1);
                check[i] = false;
                prev = arr[i]; // 현재 선택한 요소를 이전 요소로 저장
            }
        }
    }
}
