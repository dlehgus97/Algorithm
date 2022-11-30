import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String []args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int num = 1;  
        while(N>num){   //마지막 범위보다 작을시 break
            num+=6*count;  //벌집의 범위 마지막
            count++;
        }
        System.out.println(count);
    }
}
