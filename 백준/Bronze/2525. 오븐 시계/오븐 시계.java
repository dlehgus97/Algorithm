import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());

        int M = B + C;

        if (A + M / 60 >= 24) {
            System.out.println(A + (M / 60) - 24 + " " + M % 60);
        }
        else{
            System.out.println(A + (M / 60) + " " + M % 60);
        }

    }
}

