import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [] arr_1 = new int[M];
        int [] arr_2 = new int[M];

        for(int i = 0 ; i<M; i++){
            st = new StringTokenizer(br.readLine());
            arr_1[i] = Integer.parseInt(st.nextToken());
            arr_2[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr_1);
        Arrays.sort(arr_2);

        int a = arr_1[0];
        int b = arr_2[0];


        int result = 0 ;

        if(N % 6 == 0){
            if( (N / 6) * a > (b * N)){
                System.out.println((b * N));
            }
            else {
                System.out.println((N / 6) * a);
            }
        }
        else{
            if(a > b * (N % 6)){
                result += b * (N % 6);
                if(a > b * 6){
                    result += (b * 6) * (N / 6);
                }
                else {
                    result += a * (N / 6);
                }
                System.out.println(result);
            }
            else {
                System.out.println(((N / 6) + 1) * a);
            }
        }

    }
}