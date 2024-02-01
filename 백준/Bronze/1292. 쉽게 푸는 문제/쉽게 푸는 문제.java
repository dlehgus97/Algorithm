import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());


        int count = 0 ;
        int result = 0;
        int tmp = 1;

        while (count<B) {
            for(int i = 0 ; i<tmp; i++){
                count++;

                if(count >= A && count <= B){
                    result += tmp;
                }
            }
            tmp++;
        }
        System.out.println(result);
    }
}