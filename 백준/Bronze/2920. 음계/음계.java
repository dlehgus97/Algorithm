import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        String result = "";
        for (int k = 0; k < 1; k++) {
            for (int i = 1; i <= arr.length; i++) {
                if (arr[i - 1] == i) {
                    result = "ascending";
                } else {
                    result = "mixed";
                    break;
                }
            }
            if(result.equals("ascending")){
                System.out.println(result);
                break;
            }
            for (int i = arr.length; i >= 1; i--) {
                if (arr[8 - i] == i) {
                    result = "descending";
                } else {
                    result = "mixed";
                    break;
                }
            }
            System.out.println(result);
        }
    }
}


