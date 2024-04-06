import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int tmp = 1;

        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int num = (int) Math.pow(tmp, 2);

            if (num >= M && num <= N) {
                list.add(num);
            }
            if (num >= N) {
                break;
            }
            tmp++;
        }

        int result = 0;

        for (int i : list) {
            result += i;
        }
        if (list.size() > 0) {
            System.out.println(result);
            System.out.println(list.get(0));
        }
        else {
            System.out.println(-1);
        }
    }
}