import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Character[] arr = {'a', 'e', 'i', 'o', 'u'};

        while (true) {
            String str = br.readLine();
            boolean check = false;
            boolean result = true;
            boolean checking = true;

            if (str.equals("end")) {
                break;
            }

            if (str.contains("a") || str.contains("e") || str.contains("i") || str.contains("o") || str.contains("u")) {
                check = true;
            }

            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(i - 1) && str.charAt(i) != 'e' && str.charAt(i) != 'o') {
                    result = false;
                }
            }

            int check_1 = 0;
            int check_2 = 0;
            for (int i = 0; i < str.length(); i++) {
                boolean tmp = true;
                for (int j = 0; j < arr.length; j++) {
                    if (str.charAt(i) == arr[j]) {
                        check_1++;
                        check_2 = 0;
                        tmp = false;
                        break;
                    }
                }
                if (tmp) {
                    check_1 = 0;
                    check_2++;
                }
                if (check_1 >= 3 || check_2 >= 3) {
                    checking = false;
                    break;
                }
            }
            if (!check || !result || !checking) {
                System.out.println("<" + str + "> is not acceptable.");
            } else {
                System.out.println("<" + str + "> is acceptable.");
            }
        }
    }
}