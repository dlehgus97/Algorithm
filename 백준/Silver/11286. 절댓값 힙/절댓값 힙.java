import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num != 0) {
                pq.add(Math.abs(num));
                if (!map.containsKey(num)) {
                    map.put(num, 1);
                } else {
                    map.put(num, map.get(num) + 1);
                }
            } else {
                if (pq.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    int absNum = -1 * pq.remove();
                    if (map.containsKey(absNum)) {
                        int count = map.get(absNum);
                        if (count == 1) {
                            map.remove(absNum);
                        } else {
                            map.put(absNum, count - 1);
                        }
                        sb.append(absNum).append("\n");
                    } else {
                        sb.append(-1 * absNum).append("\n");
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
