import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] arr = new int[5];

        arr[0] = Integer.parseInt(br.readLine());
        arr[1] = Integer.parseInt(br.readLine());
        arr[2] = Integer.parseInt(br.readLine());
        arr[3] = Integer.parseInt(br.readLine());
        arr[4] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        System.out.println((arr[0] + arr[1] + arr[2] + arr[3] + arr[4])/5);
        System.out.println(arr[2]);
    }
}