import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            int num = Integer.parseInt(br.readLine());
            Deque<Integer> deque = new ArrayDeque<>();
            boolean wayCheck = true;
            boolean errorCheck = false;
            StringTokenizer st = new StringTokenizer(br.readLine(), "[],");

            for (int j = 0; j < num; j++) {
                deque.add(Integer.parseInt(st.nextToken()));
            }

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'R') {
                    wayCheck = !wayCheck;
                } else {
                    if (wayCheck && !deque.isEmpty()) {
                        deque.pollFirst();
                    } else if (!wayCheck && !deque.isEmpty()) {
                        deque.pollLast();
                    } else if (deque.isEmpty()) {
                        errorCheck = true;
                        break;
                    }
                }
            }

            if (errorCheck) {
                sb.append("error").append("\n");
            } else {
                if (!wayCheck) {
                    sb.append("[");
                    while (!deque.isEmpty()) {
                        sb.append(deque.pollLast());
                        if (deque.isEmpty()) {
                            break;
                        }
                        sb.append(",");
                    }
                    sb.append("]").append("\n");
                } else {
                    sb.append("[");
                    while (!deque.isEmpty()) {
                        sb.append(deque.pollFirst());
                        if (deque.isEmpty()) {
                            break;
                        }
                        sb.append(",");
                    }
                    sb.append("]").append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}