import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = 0 ; i<N; i++){
            long num = Long.parseLong(br.readLine());
            System.out.println(prime(num));
        }
    }
    public static long prime(long num){
        if(num == 0 || num == 1){
            return 2;
        }
        while(true){
            boolean check = false;
            for(long i = 2; i*i<= num; i++) {
                if (num % i == 0) {
                    check = true;
                    break;
                }
            }
                if(!check){
                    break;
                }
                num++;
            }
        return num;
    }
}
