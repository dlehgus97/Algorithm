import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = N ; i<=M ; i++){
            if(prime(i) == true){
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
    public static boolean prime(int num){
        if(num == 1) return false;
        for(int i = 2; i*i<=num; i++){  // 약수를 절반만 사용한다고 생각하면 된다
            if(num % i == 0) return false;
        }
        return true;
    }
}
