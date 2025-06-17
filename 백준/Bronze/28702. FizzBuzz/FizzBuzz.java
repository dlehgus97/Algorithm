import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String tmp = "";
        int tmp_num = 0;
        
        for (int i = 0; i < 3; i++) {
            String str = br.readLine();
            if (str.charAt(0) != 'F' && str.charAt(0) != 'B') {
                tmp = str;
                tmp_num = i;
                break;
            }
        }

        int num = Integer.parseInt(tmp) - tmp_num + 3;

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (num % 3 == 0 && num % 5 != 0) {
            System.out.println("Fizz");
        } else if (num % 3 != 0 && num % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }

    }
}