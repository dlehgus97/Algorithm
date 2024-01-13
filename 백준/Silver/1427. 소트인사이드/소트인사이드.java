import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = new String(br.readLine());

        char [] arr = new char[str.length()];

        for(int i = 0 ; i<arr.length; i++){
            arr[i] = str.charAt(i);
        }

        Arrays.sort(arr);

        for(int i = arr.length -1 ; i>=0; i--){
            System.out.print((char)arr[i]);
        }
    }
}