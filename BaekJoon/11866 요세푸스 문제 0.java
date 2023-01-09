import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String [] args ) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Queue<Integer> que = new LinkedList<>();

        for(int i = 1; i<=N; i++){
            que.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (que.size()>1){

            for(int i =0 ; i<M-1; i++){
                que.add(que.remove());
            }
            sb.append(que.remove()).append(", ");
        }

        sb.append(que.remove()).append(">");  //마지막만 따로 빼야 ,를 게속 생략 할 수 있다.
        System.out.println(sb);
    }
}

//que.add를 que.offer로 대체해도 되며 que.remove를 que.poll로 대체해도 된다.
