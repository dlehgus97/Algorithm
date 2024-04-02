import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deque1 = new ArrayDeque<>();
        Deque<Integer> deque2 = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[]arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            deque1.add(arr[i]);
            deque2.add(i + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();

        while (!deque1.isEmpty()) {
            int num1 = deque1.peek();
            int num2 = deque2.peek();
            list.add(num2);
            if (num1 < 0) {
                deque1.poll();
                deque2.poll();
                for (int i = 0; i < -num1; i++) {
                    if (!deque1.isEmpty()) {
                        deque1.addFirst(deque1.pollLast());
                        deque2.addFirst(deque2.pollLast());
                    }
                }
            } else {
                deque1.poll();
                deque2.poll();

                for (int i = 0; i < num1 - 1; i++) {
                    if (!deque1.isEmpty()) {
                        deque1.addLast(deque1.pollFirst());
                        deque2.addLast(deque2.pollFirst());
                    }
                }
            }
        }
        for(int i : list){
            System.out.print(i + " ");
        }
    }
}

