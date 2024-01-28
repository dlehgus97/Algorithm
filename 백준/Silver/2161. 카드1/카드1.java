import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer>que = new LinkedList<>();

        StringBuilder sb = new StringBuilder();

        for(int i = 1 ; i<=N; i++){
            que.add(i);
        }


        while(N-->0){
            sb.append(que.peek()).append(" ");
            que.poll();
            que.add(que.poll());
        }
        System.out.println(sb);
    }
}