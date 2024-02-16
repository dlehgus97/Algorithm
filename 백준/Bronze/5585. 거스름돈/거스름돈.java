import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = 1000 - Integer.parseInt(br.readLine());
        int count = 0;
        while(N>0){
            if(N>=500){
                count += N/500;
                N -= (N/500) * 500;
            }
            else if(N>=100){
                count += N/100;
                N -= (N/100) * 100;

            }
            else if(N>=50){
                count += N/50;
                N -= (N/50) * 50;
            }
            else if(N>=10){
                count += N/10;
                N -= (N/10) * 10;
            }
            else if(N>=5){
                count += N/5;
                N -= (N/5) * 5;
            }
            else if(N>=1){
                count += N/1;
                N -= (N/1) * 1;
            }
        }
        System.out.println(count);
    }
}