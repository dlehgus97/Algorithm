import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        Queue<Integer> que = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            que.add(i);
        }

        sb.append("<");

        while (que.size() > 0) {
            for (int i = 0; i < K - 1; i++) {
                que.add(que.poll());
            }
            if (que.size() == 1) {
                sb.append(que.poll()).append(">");
                break;
            }
            sb.append(que.poll()).append(", ");
        }
        System.out.println(sb);
    }
}