import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0 ; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            double [] arr = new double[A];
            double result = 0;

            for(int j = 0; j<arr.length; j++){
                arr[j] = Integer.parseInt(st.nextToken());
                result += arr[j];
            }
            double avg = result / A ;
            double count =0;

            for(int j = 0 ; j<arr.length; j++){
                if(arr[j] > avg){
                    count ++;
                }
            }
            System.out.printf("%.3f", (double)((count / A) * 100));
            System.out.println("%");
        }
    }
}