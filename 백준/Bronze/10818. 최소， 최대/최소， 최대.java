import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = -10000001;
        int min = 1000001;

       for(int i = 0 ; i<N; i++){
           arr[i] = Integer.parseInt(st.nextToken());
           if(arr[i]>max){
               max = arr[i];
           }
           if(arr[i]<min){
               min = arr[i];
           }

       }
       System.out.println(min + " " + max);
    }
}


