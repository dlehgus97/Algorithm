import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int [] arr;
    public static StringBuilder sb ;
    public static boolean [] check;

    public static int N,M;

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        check = new boolean[N + 1 ];

        sb = new StringBuilder();

        dfs(0);
        System.out.println(sb);

    }

    public static void dfs(int depth){
        if(depth == M){
            for(int a : arr) {
                sb.append(a + " ");
            }
            sb.append("\n");
            return;
        }
        for(int i = 1  ; i<=N; i++){
            if(!check[i]){
                arr[depth] = i;
                dfs(depth + 1);
            }
        }
    }
}