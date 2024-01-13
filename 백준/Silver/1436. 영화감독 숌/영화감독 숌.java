import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = 0 ;
        int num = 0 ;

        String str  = "";

        while(result != N){
            num++;
            str = Integer.toString(num);
            if(str.contains("666")){
                result ++;
            }

        }
        System.out.println(num);
    }
}