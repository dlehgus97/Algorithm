import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int [] arr1 = new int[A];
        int [] arr2 = new int[B];
        int [] result = new int[A+B];


        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i<A; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
            result[i] = arr1[i];
        }

        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i<B; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
            result[i+A] = arr2[i];
        }

        Arrays.sort(result);

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i<result.length; i++){
            sb.append(result[i]).append(" ");
        }
        System.out.println(sb);
    }
}