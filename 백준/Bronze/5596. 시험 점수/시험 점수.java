import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        for(int i = 0 ; i<2; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int tmp = 0;
            for(int j = 0 ; j<4; j++){
                tmp += Integer.parseInt(st.nextToken());
            }
            if(max<tmp){
                max = tmp;
            }
        }
        System.out.println(max);
    }
}