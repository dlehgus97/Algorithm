import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int [][] arr ;
    static boolean [] check;
    static int T,M;
    static int result = 0;
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        arr = new int[T+1][T+1];
        check = new boolean[T+1];

        for(int i = 0 ; i<M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            arr[A][B] = arr[B][A] = 1;
        }
        System.out.println(dfs(1));
    }
    
    public static int dfs(int num){
        check[num] = true;

        for(int i = 1 ; i<=T; i++){
            if(arr[num][i] == 1 && !check[i]){
                result++;
                dfs(i);
            }
        }
        return result;
    }
}