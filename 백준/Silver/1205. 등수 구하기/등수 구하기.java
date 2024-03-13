import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        if(N == 0){
            System.out.println(1);
        }
        else {
            int rank = 1;
            int count = 0;

            st = new StringTokenizer(br.readLine());

            int[] arr = new int[N];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                if (arr[i] > M) {
                    rank++;
                } else if (arr[i] == M) {
                    count++;
                }
            }

            StringBuilder sb = new StringBuilder();

            if (rank + count <= P) {
                sb.append(rank);
            } else {
                sb.append(-1);
            }

            System.out.println(sb);
        }
    }
}