import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int result = 0 ;
        int min = 10001 ;

        for(int i = M; i<=N; i++){
            if(prime(i) == true){
                result += i;
                if(min>i){
                    min = i;
                }
            }
        }
        if(result>0) {
            System.out.println(result);
            System.out.println(min);
        }
        else{
            System.out.println(-1);
        }
    }

    public static boolean prime(int a) {
        if (a == 1) return false;
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) return false;
        }
        return true;
    }
}
