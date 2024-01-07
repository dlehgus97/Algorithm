import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int result = 1;

        while(true){

            int tmp  = result;
            int num = tmp ;

            while(tmp>0){
                num += tmp%10;
                tmp /=10;
            }

            if(num == N){
                break;
            }
            
            result ++;
            if(result == 1000001){
                result = 0;
                break;
            }
        }
        System.out.println(result);


    }
}