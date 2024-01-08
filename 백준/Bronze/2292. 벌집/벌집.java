import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int tmp = 2;
        int result = 1 ;

        if(N == 1 ){
            System.out.println(1);
        }
        else {
            while (tmp <= N) {
                tmp += (6 * result);
                result++;
            }
            System.out.println(result);
        }
    }
}
