import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i<N; i++){
            String [] arr = br.readLine().split(" ");
            for(int j = 0 ; j<arr.length; j++){
                for(int k = 0 ; k<arr[j].length(); k++){
                  sb.append(arr[j].charAt(arr[j].length() - 1 - k));
                }
                sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}