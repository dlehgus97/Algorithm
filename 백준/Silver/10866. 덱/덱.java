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
           String word = st.nextToken();
            if (word.equals("push_front")) {
                deq.addFirst(Integer.parseInt(st.nextToken()));
            }
            else if (word.equals("push_back")) {
                deq.addLast(Integer.parseInt(st.nextToken()));
            }
            else if (word.equals("pop_front")) {
                if (!deq.isEmpty()) {
                    sb.append(deq.pollFirst()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            }
            else if (word.equals("pop_back")) {
                if (!deq.isEmpty()) {
                    sb.append(deq.pollLast()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            }
            else if (word.equals("size")) {
                sb.append(deq.size()).append("\n");
            }
            else if (word.equals("empty")) {
                if (!deq.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(1).append("\n");
                }
            }
            else if (word.equals("front")){
                if (!deq.isEmpty()) {
                    sb.append(deq.peekFirst()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            }
            else if (word.equals("back")) {
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