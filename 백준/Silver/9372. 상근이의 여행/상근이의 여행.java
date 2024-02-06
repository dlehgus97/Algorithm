import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int [][] arr;
    static boolean [] visted;
    static int N,M;
    static int result;

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            arr = new int[N+1][N+1];
            visted = new boolean[N+1];

            for(int j = 0 ; j<M; j++){
                st = new StringTokenizer(br.readLine());
                int N = Integer.parseInt(st.nextToken());
                int M = Integer.parseInt(st.nextToken());
                arr[N][M] = arr[M][N] = 1;
            }

            System.out.println(bfs(1) - 1); // 결국은 그냥 모든 노드를 구해서 -1 을 해주면 최소 간선개수가 된다는걸 어렵게 풀어낸것이다 .
        }
    }
    /*그냥 N이 노드인걸 알기에 System.out.println(N - 1)을 하면 해결가능  */
    public static int bfs(int num){
        Queue<Integer>que = new LinkedList<>();
        que.offer(num);
        visted[num]= true;
        result = 0;

        while(!que.isEmpty()){
            num = que.poll();
            result++;
            for(int i = 1 ; i<=N; i++){
                if(arr[num][i] == 1 && !visted[i]){
                    que.offer(i);
                    visted[i] = true;
                }
            }
        }
        return result;
    }
}