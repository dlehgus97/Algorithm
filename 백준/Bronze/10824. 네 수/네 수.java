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
        String str_3 = st.nextToken();
        String str_4 = st.nextToken();
        
        String num_1 = str_1 + str_2;
        String num_2 = str_3 + str_4;

        long result = Long.parseLong(num_1) + Long.parseLong(num_2);
        System.out.println(result);
    }
}
