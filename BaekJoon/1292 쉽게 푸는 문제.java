import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int result = 0 ;
        for(int i = 1; i<=B; i++){
            result +=i;
        }
        int [] arr = new int[result];
        int count = 0;
        for(int i = 1 ; i<=B; i++){
            for(int j = 0 ; j<i; j++) {
                arr[count] = i;
                count++;
            }
        }
        int num = 0;
        for(int i = A-1 ; i<=B-1; i++){
            num += arr[i];
        }
        System.out.println(num);
    }
}
