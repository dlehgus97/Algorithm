import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<N; i++){
            str[i] = br.readLine();
            String[] arr = str[i].split(" ");
            for(int j = 0 ; j<arr.length; j++){
                for(int k = arr[j].length()-1;  k>=0; k--){
                   sb.append(arr[j].charAt(k));
                }
                sb.append(" ");
            }
        }
        System.out.println(sb+"\n");

    }
}
