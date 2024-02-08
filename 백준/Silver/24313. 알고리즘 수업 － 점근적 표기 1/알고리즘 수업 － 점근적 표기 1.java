import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public  class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int C = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int result = 1;
        for(int i = n ; i<101; i++){
            if((N*i) + M > C*i){
                result = 0;
                break;
            }
        }
        System.out.println(result);
    }
}