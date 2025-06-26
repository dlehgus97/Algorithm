import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        String[] arr = {"000", "001", "010", "011", "100", "101", "110", "111"}; // 8진수

        if (str.equals("0")) {
            System.out.println(str);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            int tmp = str.charAt(i) - '0';
            sb.append(arr[tmp]);
        }

        // 앞의 0 전부 제거
        while (sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        System.out.println(sb);
    }
    /* 런타임 에러
    String str = br.readLine();
    int num = Integer.parseInt(str,8);
    System.out.println(Integer.toBinaryString(num)); */
}