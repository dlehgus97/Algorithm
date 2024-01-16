import javax.management.StringValueExp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deq = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int word = Integer.parseInt(st.nextToken());
            if (word == 1) {
                deq.addFirst(Integer.parseInt(st.nextToken()));
            }
            else if (word == 2) {
                deq.addLast(Integer.parseInt(st.nextToken()));
            }
            else if (word == 3) {
                if (!deq.isEmpty()) {
                    sb.append(deq.pollFirst()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            }
            else if (word == 4) {
                if (!deq.isEmpty()) {
                    sb.append(deq.pollLast()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            }
            else if (word == 5) {
                sb.append(deq.size()).append("\n");
            }
            else if (word == 6) {
                if (!deq.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(1).append("\n");
                }
            }
            else if (word == 7) {
                if (!deq.isEmpty()) {
                    sb.append(deq.peekFirst()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            }
            else if (word == 8) {
                if (!deq.isEmpty()) {
                    sb.append(deq.peekLast()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}