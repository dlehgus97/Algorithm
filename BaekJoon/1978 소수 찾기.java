import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public  class Main {
    public static void  main(String []  args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0;

        for(int i = 0; i<N; i++){
            int count =0 ;
            for(int j = 2; j<=1000; j++) {
                if (arr[i] % j == 0) {
                    count++;
                }
                if(count == 2)
                    break;
            }
            if(count == 1){
                result ++;
            }
        }
        System.out.println(result);
    }
}
