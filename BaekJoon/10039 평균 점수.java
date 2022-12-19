import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[5];
        int total = 0;

        for(int i = 0 ; i<5; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i] <40){
                arr[i] = 40;
            }
            total += arr[i];
        }
        System.out.println(total / 5);

    }
}
