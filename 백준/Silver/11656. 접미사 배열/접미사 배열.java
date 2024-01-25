import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String str = br.readLine();

        String [] arr = new String[str.length()];
        
        for(int i = 0 ; i<str.length(); i++){
            arr[i] = "";
            for(int j = i ; j < str.length(); j++){
                arr[i] += str.charAt(j);
            }
        }
        Arrays.sort(arr);

        for(String result : arr){
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
