import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Character[] arr = {'a', 'e', 'i', 'o', 'u'};

        String str = br.readLine();

        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < arr.length; j++) {
                if (str.charAt(i) == arr[j]) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}