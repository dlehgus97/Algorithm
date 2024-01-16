import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] arr_1 = new int[2];
        int [] arr_2 = new int[2];

        for(int i = 0 ; i<2; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr_1[i] = Integer.parseInt(st.nextToken());
            arr_2[i] = Integer.parseInt(st.nextToken());
        }
        int result_1 = (arr_1[0] * arr_2[1]) + (arr_2[0] * arr_1[1]);
        int result_2 = arr_2[0] * arr_2[1];
        int tmp =  gcd(result_1,result_2);

        System.out.println((result_1/tmp) + " "+ (result_2/tmp));
    }
    public static int gcd(int a , int b){
        if(b == 0){
            return a;
        }
        return gcd(b,a%b);
    }
}