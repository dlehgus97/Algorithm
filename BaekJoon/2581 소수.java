import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M =Integer.parseInt(br.readLine());
        int N =Integer.parseInt(br.readLine());
        int min = 100001;
        int result = 0;


        for(int i = M; i<=N; i++){
            int count = 0;
            for(int j = 2; j<=N; j++){
                if(i%j == 0) {
                    count++;
                }
                if(count == 2){
                    break;
                }
            }
            if(count == 1){
                result += i;
                if(i<min)
                    min = i;
            }
        }
        StringBuilder sb = new StringBuilder();

        if(result>0){
            sb.append(result).append("\n").append(min);
        }
        else
            sb.append(-1);
        System.out.println(sb);
    }
}
