import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int N, M;
    public static boolean[] check;
    public static int [] answer ;
    public static int[] arr;
    public static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        answer = new int[M];
        sb = new StringBuilder();
        check = new boolean[N + 1];

        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i<N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        dfs(0 , 0);
        System.out.println(sb);

    }

    public static void dfs(int depth , int start){
        if(depth == M){
            for(int a : answer){
                sb.append(a + " ");
            }
            sb.append("\n");
            return;
        }

        int prev = 0 ;

        for(int i = start ; i<arr.length; i++){
            if(!check[i] && prev != arr[i]){
                check[i] = true;
                answer[depth] = arr[i];
                dfs(depth + 1 , i + 1);
                check[i] = false;
                prev = arr[i];
            }
        }
    }
}