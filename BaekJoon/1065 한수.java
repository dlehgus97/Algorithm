import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
      
        System.out.println(hanSu(N));
    }
  
    static int hanSu(int a) {
        int count = 99;

        if (a < 100) {
            return a;
        }
            for (int i = 100; i <= a; i++) {

                int three = i % 10;  //1의 자리수
                int two = (i / 10) % 10; // 10의 자리수
                int one = i / 100; // 100의 자리수
                if (three - two == two - one) {
                    count++;
                }
            }
        return count;
    }
}
