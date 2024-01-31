import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> que = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            que.add(Integer.parseInt(br.readLine()));
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int tmp = 1;

        while (!que.isEmpty()) {
            if (!stack.isEmpty() && que.peek().equals(stack.peek())) {
                que.poll();
                stack.pop();
                sb.append("-").append("\n");
            } else {
                stack.push(tmp);
                sb.append("+").append("\n");
                tmp++;
            }

            if (tmp > N + 1) {
                break;
            }
        }

        if (que.isEmpty()) {
            System.out.println(sb);
        } else {
            System.out.println("NO");
        }
    }
}
