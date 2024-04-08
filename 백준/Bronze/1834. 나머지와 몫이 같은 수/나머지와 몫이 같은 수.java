import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] asrgs) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());

        long result = 0;

        for(long i = 0;  i< N ;i++){
            result += (N + 1) * i;
        }
        System.out.println(result);
    }
}