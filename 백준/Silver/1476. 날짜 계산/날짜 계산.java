import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int result = 0 ;

        int a = 0;
        int b = 0;
        int c = 0;

        while(true){
            if(a == 16){
                a = 1;
            }
            if(b == 29){
                b = 1;
            }
            if(c == 20){
                c = 1;
            }
            if(A == a && B == b && C == c){
                break;
            }
            a++;
            b++;
            c++;
            result++;
        }
        System.out.println(result);
    }
}