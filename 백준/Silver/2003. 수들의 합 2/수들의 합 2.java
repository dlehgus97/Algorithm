import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [] arr = new int[N];
        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0;

        for(int i = 0 ; i<N; i++){
            int num = 0;
            for(int j = i; j<N; j++){
                num += arr[j];
                if(num == M){
                    result++;
                    break;
                }
                else if (num>M) {
                    break;
                }
            }
        }
        System.out.println(result);
    }
}