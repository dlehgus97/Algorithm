import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[]args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int Num = Integer.parseInt(br.readLine());
        int total = 0;
        int x = Num;
        while(true){
            int a = ((x%10)*10)+(((x/10)+(x%10))%10);
            x = a;
            total++;
            if(Num == a){
                break;
            }
        }
System.out.println(total);
    }
}
