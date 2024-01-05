import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] arr = new int[10];
        
        long A = Long.parseLong(br.readLine());
        long B = Long.parseLong(br.readLine());
        long C = Long.parseLong(br.readLine());

        long total = (A * B * C) ;

        while(total > 0){
            long tmp = total % 10 ;
            arr[(int)tmp]++;
            total /= 10;
        }
        for(int i = 0 ; i<10; i++){
            System.out.println(arr[i]);
        }

    }
}
