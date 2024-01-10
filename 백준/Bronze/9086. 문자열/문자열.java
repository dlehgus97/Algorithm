import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0 ; i<N; i++) {
            String word = br.readLine();
            System.out.print(word.charAt(0));
            System.out.println(word.charAt(word.length()-1));
        }
    }
}

