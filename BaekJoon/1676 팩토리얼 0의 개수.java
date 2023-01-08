import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int count = 0 ;

        while(N>=5){
            count += N/5;
            N /= 5;
        }

        System.out.println(count);


    }
}

//간단한 문제 0이 나올려면 2*5 형태가 되어야한다 근데 2는 충분히 있기 때문에 *5 의 개수가 0의 개수를 결정한다. 
