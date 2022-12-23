import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new LinkedList<Integer>();


        int N = Integer.parseInt(br.readLine());
        int num = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String word = st.nextToken();
            if (word.equals("push_front")) {
                num = Integer.parseInt(st.nextToken());
                deque.addFirst(num);
            }
            else if(word.equals("push_back")){
                num = Integer.parseInt(st.nextToken());
                deque.addLast(num);
            }
            else if (word.equals("pop_front")) {
                if (deque.isEmpty()) {
                    sb.append(-1).append("\n");
                } else sb.append(deque.pollFirst()).append("\n");
            }
            else if (word.equals("pop_back")) {
                if (deque.isEmpty()) {
                    sb.append(-1).append("\n");
                } else sb.append(deque.pollLast()).append("\n");
            }
            else if (word.equals("size")) {
                sb.append(deque.size()).append("\n");
            }
            else if (word.equals("empty")) {
                if (deque.isEmpty()) {
                    sb.append(1).append("\n");
                } else
                    sb.append(0).append("\n");
            }
            else if (word.equals("front")) {
                if (deque.isEmpty()) {
                    sb.append(-1).append("\n");
                } else
                    sb.append(deque.peekFirst()).append("\n");
            }
            else if (word.equals("back")) {
                if (deque.isEmpty()) {
                    sb.append(-1).append("\n");
                } else
                    sb.append(deque.peekLast()).append("\n");
            }
        }
        System.out.println(sb);
    }
}
