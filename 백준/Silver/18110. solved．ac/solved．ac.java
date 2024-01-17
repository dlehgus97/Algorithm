import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int [] arr = new int[N];

        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        double total = Math.round((N * 15) / 100.0);
        int num = (int)total;

        int  tmp = 0 ;
        for(int  i = num ; i<N - num; i++){
            tmp += arr[i];
        }
        double result  =  Math.round(tmp / (double)((N -(num *2))));
        System.out.println((int)result);
    }
}