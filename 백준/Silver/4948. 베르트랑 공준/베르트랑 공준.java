import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));

        boolean [] check = new boolean[246913];

        for (int i = 2; i <= 246912; i++) {
            int cnt = 0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 1) {
                check[i] = true;
            }
        }

        StringBuilder sb = new StringBuilder();

        while(true){
            int N = Integer.parseInt(br.readLine());
            if(N == 0){
                break;
            }
            int cnt = 0;
            for(int i  = N + 1 ; i<=N*2 ; i++){
                if(check[i]){
                    cnt++;
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}