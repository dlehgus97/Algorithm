import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static int N,M;
    public static int [] arr;
    public static int [] ans;
    public static StringBuilder sb = new StringBuilder() ;
    public static boolean [] check;
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        arr = new int[N];
        ans = new int[N];
        check = new boolean[N];

        for(int i =  0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        dfs(0);
        System.out.println(sb.toString());

    }

    public static void dfs(int depth){
        if(depth == M){
            for (int i = 0; i < M; i++) {
                sb.append(ans[i]).append(" ");
            }
            sb.append("\n");
            return ;
        }

        for(int i = 0 ; i<N ; i++){
            if(!check[i]){
                check[i] = true;
                ans[depth] = arr[i];
                dfs(depth + 1);
                check[i] = false;
            }
        }
    }
}