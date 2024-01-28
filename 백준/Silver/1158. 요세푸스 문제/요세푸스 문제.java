import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
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

        int i = 1;

        while(que.size()>0){
            if(i == M) {
                if (que.size() == 1) {
                    sb.append(que.poll());
                } else {
                    sb.append(que.poll()).append(", ");
                    i = 1;
                }
            }
            else{
                que.add(que.poll());
                i++;
            }
        }
        sb.append(">");
        System.out.println(sb);
    }
}