import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String []args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int last = V - B ;
        int high = A - B ;

        int result = 0 ;

        if(last % high == 0){
            result = last  / high;
        }
        else {
            result = last  / high + 1;
        }

        System.out.println(result);

        /* while문을 사용해서 했더니 시간초과났움
          V - B 를 하는 이유는  A - B 로 전부를 다계산 한다음에
          정상에 도달하는것은 낮이지기 때문에 식을 보게되면 A + B + A  이렇게 B가 없게된다 (낮이라)
          그래서 A - B를 다 나눠주고  본래 V에다가 - B를 하게 되면 동일한 식이 되는것이다
        */
        
    }
}