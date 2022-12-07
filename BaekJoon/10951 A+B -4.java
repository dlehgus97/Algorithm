import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public  static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str ;
        while((str =br.readLine()) != null ){
            StringTokenizer st = new StringTokenizer(str," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            System.out.println(A+B);
        }

    }
}

//EOF 문제 ..  EOF 는 이렇게 데이터가 더이상 존재하지 않을 때 라고 함.
//BufferedReader 의 경우 null 을 반환한다. 이 부분은 오히려 null 인지 아닌지만 조건문을 통해 구분해주면 되므로 쉽다.

//참고 https://st-lab.tistory.com/40
