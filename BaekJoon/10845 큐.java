import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<Integer>();


        int N = Integer.parseInt(br.readLine());
        int num = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String word = st.nextToken();
            if (word.equals("push")) {
                num = Integer.parseInt(st.nextToken());
                queue.offer(num);
            }
            else if (word.equals("pop")) {
                if (queue.isEmpty()) {
                    sb.append(-1).append("\n");
                } else sb.append(queue.poll()).append("\n");
            }
            else if (word.equals("size")) {
                sb.append(queue.size()).append("\n");
            }
            else if (word.equals("empty")) {
                if (queue.isEmpty()) {
                    sb.append(1).append("\n");
                } else
                    sb.append(0).append("\n");
            }
            else if (word.equals("front")) {
                if (queue.isEmpty()) {
                    sb.append(-1).append("\n");
                } else
                    sb.append(queue.peek()).append("\n");
            }
            else if (word.equals("back")) {
                if (queue.isEmpty()) {
                    sb.append(-1).append("\n");
                } else
                    sb.append(num).append("\n");
            }
        }
        System.out.println(sb);
    }
}
