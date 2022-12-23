import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());


        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String word = st.nextToken();
            if (word.equals("push")) {
                stack.push(Integer.parseInt(st.nextToken()));
            }
            else if (word.equals("pop")) {
                if (stack.isEmpty()) {
                    sb.append(-1).append("\n");
                } else sb.append(stack.pop()).append("\n");
            }
            else if (word.equals("size")) {
                sb.append(stack.size()).append("\n");
            }
            else if (word.equals("empty")) {
                if (stack.isEmpty()) {
                    sb.append(1).append("\n");
                } else
                    sb.append(0).append("\n");
            }
            else if (word.equals("top")) {
                if (stack.isEmpty()) {
                    sb.append(-1).append("\n");
                } else
                    sb.append(stack.peek()).append("\n");
            }
        }
        System.out.println(sb);
    }
}
