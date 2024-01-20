import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean[] arr = new boolean[10001];


        for (int i = 1; i < 10001; i++) {
            int num = i;
            int tmp = i;
            while (true) {
                num += tmp % 10;
                if (tmp < 10) {
                    break;
                }
                tmp /= 10;
            }
            if (num <= 10000) {
                arr[num] = true;
            }
        }
        for (int i = 1; i < 10001; i++) {
            if (arr[i] == false) {
                System.out.println(i);
            }
        }
    }
}