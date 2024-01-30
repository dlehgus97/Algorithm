import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));

        int N = Integer.parseInt(br.readLine());

        for(int i = 0 ; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int result = 0;


            Queue<Integer>que1 = new LinkedList<>();
            Queue<Integer>que2 = new LinkedList<>();

            st = new StringTokenizer(br.readLine());

            for(int j = 0 ; j<A; j++){
                que1.add(j);
                que2.add(Integer.parseInt(st.nextToken()));
            }

            while(que1.size()>0) {
                int num = Collections.max(que2);

                if(num != que2.peek()){
                    que1.add(que1.poll());
                    que2.add(que2.poll());
                }
                else{
                    if(que1.peek() == B){
                        que1.poll();
                        que2.poll();
                        result++;
                        break;
                    }
                    else{
                        que1.poll();
                        que2.poll();
                        result++;
                    }
                }
            }
            System.out.println(result);
        }
    }
}