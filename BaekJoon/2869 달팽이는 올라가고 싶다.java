import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int count = (V-B)/(A-B);

        if((V-B) % (A-B) != 0)
            count ++;



        System.out.println(count);
    }
}
/* 결국 도착하는 것은 낮이기 떄문에 
1일차 낮 = A
2일차 낮 = A - B + A
3일차 낮 = A - B + A - B + A
4일차 낮 = A - B + A - B + A - B + A
X일차 낮 = (A - B) * (X - 1) + A
이런 상태일 것이다.

따라서 

V = AX - A - BX + B + A
V = X * (A-B) + B
V - B = X * (A-B)
X = (V - B) / (A - B)

잘 이해하지 못해 다른 블로그를 참고 하였음 .. */


//반복문을 통해 시간초과 발생 ㅠ
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int result = 0 ;
        int count = 0;
        while(true){
                result += A;
                count++;
                if(result>=V)
                    break;
                result -= B;
        }
        System.out.println(count);
    }
}

