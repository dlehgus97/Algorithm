import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String [] arr1 = new String[N];
        String [] arr2 = new String[M];

        for(int i = 0 ; i<N; i++){
            arr1[i] = br.readLine() ;
        }

        for(int i = 0 ; i<M; i++){
            arr2[i] = br.readLine() ;
        }

        int result = 0 ;

        for(int i = 0 ; i<N; i++){
            for(int j = 0 ; j<M; j++){
                if(arr1[i].equals(arr2[j])){
                    result ++;
                }
            }
        }
        System.out.println(result);
    }
}