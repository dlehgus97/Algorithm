import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            if (num == 0) {
                if (pq.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(pq.remove()).append("\n");
                }
            } else {
                for (int j = 0; j < num; j++) {
                    pq.add(Integer.parseInt(st.nextToken()));
                }
            }
        }
        System.out.println(sb);
    }
}