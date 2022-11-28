import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int arr[];
        for(int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            int T = Integer.parseInt(st.nextToken());
            arr = new int[T];
            double result = 0;
            for(int j = 0; j<T; j++){
                int num =  Integer.parseInt(st.nextToken());
                arr[j] = num;
                result+= num;
            }
            double avg = result/T;
            double count = 0;
            for(int j = 0; j<T; j++ ){
                if(arr[j]>avg)
                    count++;

            }
            System.out.printf("%.3f%%\n", (count/T)*100); //소수점 자르기 
        }


    }
}
