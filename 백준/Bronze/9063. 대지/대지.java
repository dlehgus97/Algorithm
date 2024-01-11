import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int [] arr_1 = new int[N];
        int [] arr_2 = new int[N];

        for(int i = 0 ; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr_1[i] = Integer.parseInt(st.nextToken());
            arr_2[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr_1);
        Arrays.sort(arr_2);

        System.out.println((arr_1[N-1] - arr_1[0]) * (arr_2[N-1] - arr_2[0]));
    }
}
