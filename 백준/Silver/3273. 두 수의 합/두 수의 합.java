import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int [] arr = new int[N];
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int X = Integer.parseInt(br.readLine());


        int result = 0;
        for(int i = 0 ; i<arr.length - 1; i++){
            for(int j = i+1; j<arr.length ; j++){
                if(X - arr[i] == arr[j]){
                    result ++;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}