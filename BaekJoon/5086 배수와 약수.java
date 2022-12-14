import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String []args ) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = 1 ; int B = 1;
        StringBuilder sb = new StringBuilder();

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            if(A == 0 && B == 0){
                break;
            }
            if(B % A ==0){
                sb.append("factor").append("\n");
            }
            if(A % B == 0 ){
                sb.append("multiple").append("\n");
            }
            if(A%B != 0 && B%A != 0){
                sb.append("neither").append("\n");
            }

        }
        System.out.println(sb);
    }
}
