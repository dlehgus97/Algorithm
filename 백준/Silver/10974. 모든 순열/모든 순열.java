import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int [] arr;
    public static boolean [] check ;
    public static StringBuilder sb;
    public static int N ;
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        N = Integer.parseInt(br.readLine());

        arr = new int[N];
        check = new boolean[N + 1];
        sb = new StringBuilder();

        dfs(0);

        System.out.println(sb);
    }

    public static void dfs(int depth){
        if(depth == N){
            for(int a : arr){
                sb.append(a + " ");
            }
            sb.append("\n");
            return;
        }
        for(int i = 0; i<N; i++){
            if(!check[i]){
                check[i] = true;
                arr[depth] = i + 1;
                dfs(depth + 1);
                check[i] = false;
            }
        }
    }
}
