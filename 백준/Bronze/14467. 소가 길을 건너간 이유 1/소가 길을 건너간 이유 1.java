import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[11][1];
        int result = 0;

        for(int i = 1; i < 11; i++) {
            arr[i][0] = -1;
        }

        for(int i = 0; i < n; i++) {
           StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(arr[a][0] == -1) {
                arr[a][0] = b;
            }
            else {
                if(arr[a][0] != b) {
                    result++;
                    arr[a][0] = b;
                }
            }
        }

        System.out.println(result);
    }
}