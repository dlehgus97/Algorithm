import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int count = 0;
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());

            count ++ ;

            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());

            if(L == 0 && P == 0 && V == 0){
                break;
            }
            int result = 0;

            while(true){
                if(V>=P){
                    result += L;
                    V -= P;
                }
                else{
                    result += Math.min(L,V);
                    break;
                }
            }
            sb.append("Case " ).append(count + ": ").append(result).append("\n");
        }
        System.out.println(sb);
    }
}