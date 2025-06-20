import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double R = Integer.parseInt(br.readLine());
        System.out.println(String.format("%.6f", Math.PI * R * R));
        System.out.println(String.format("%.6f", R * R * 2));
    }
}