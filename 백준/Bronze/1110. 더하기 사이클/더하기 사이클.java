import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int tmp = N;
        int count = 0;

        while(true){
            int num = (tmp / 10) + (tmp % 10) ;
            String result = Integer.toString(tmp % 10) + Integer.toString(num%10);
            count ++;
            if(N == Integer.parseInt(result)){
                break;
            }
            tmp = Integer.parseInt(result);
        }
        System.out.println(count);
    }
}