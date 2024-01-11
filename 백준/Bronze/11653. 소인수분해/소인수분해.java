import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        if (N == 1) {
            System.out.println("");
        } 
        else {
            int i = 2;
            while (N > 1) {
                if (N % i == 0) {
                    sb.append(i).append("\n");
                    N /= i;
                } else {
                    i++;
                }
            }
            System.out.println(sb);
        }
    }
}
