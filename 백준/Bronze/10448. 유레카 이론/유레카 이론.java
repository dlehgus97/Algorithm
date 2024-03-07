import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] dp = new int[45];

        for (int i = 1; i < 45; i++) {
            dp[i] = i * (i + 1) / 2;
        }

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<N; i++){
            int A = Integer.parseInt(br.readLine());
            boolean check = false;
            for(int j = 1 ; j<45; j++){
                for(int k = 1 ; k<45; k++){
                    for(int l = 1 ; l<45; l++){
                        if(dp[j] + dp[k] + dp[l] == A){
                            check= true;
                            break;
                        }
                    }
                }
            }
            if(check){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}