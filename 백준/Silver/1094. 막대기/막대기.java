import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int [] arr = {64,32,16,8,4,2,1};
        int result = 0 ;
        int tmp = 0;

        while(N>0){
            int num = 0;
            if(N >= arr[tmp]){
                 num = N / arr[tmp];
                 N -= num * arr[tmp];
                 result += num;
            }
            tmp++;
        }
        System.out.println(result);
    }
}