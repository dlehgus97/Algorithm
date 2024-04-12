import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int [] arr = new int[N + 1 ];

        int result = 0 ;
        for(int i = N ; i>0 ; i--){
            int num = i;
            int tmp = 0;
            while(num>0){
                if(num%10 == 7 || num % 10 == 4 ){
                    tmp = i;
                }
                else{
                    tmp = 0 ;
                    break;
                }
                num /= 10;
            }

            result = Math.max(result , tmp);
        }

        System.out.println(result);
    }
}
