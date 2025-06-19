import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str_1 = br.readLine();
        String str_2 = br.readLine();

        if (str_1.length() >= str_2.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}