import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] arr_1 = new int[N];
        int [] arr_2 = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i<N; i++){
            arr_1[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i<N; i++){
            arr_2[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr_1);
        Arrays.sort(arr_2);

        int result = 0;

        for(int i = 0 ; i<N; i++){
            result += arr_1[i] * arr_2[N-i-1];
        }
        System.out.println(result);
    }
}