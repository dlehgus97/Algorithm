import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String str_1 = st.nextToken();
        String str_2 = st.nextToken();

        if (str_1.equals(str_2)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}