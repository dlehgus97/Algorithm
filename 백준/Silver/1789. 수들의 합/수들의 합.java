import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long N = Long.parseLong(br.readLine());

        long result = 0;
        int count = 1 ;

        while(true){
            result += count;
            if(result>=N){
                break;
            }
            count ++;
        }

        if(result == N){
            sb.append(count);
        }
        else{
            sb.append(count-1);
        }
        System.out.println(sb);
    }
}