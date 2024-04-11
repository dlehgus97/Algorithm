import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args ) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int [] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for(int i = 0 ; i<arr.length/2; i++){
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }

        int [] findMax = new int[N];

        int maxResult = 0 ;

        for(int i = 0 ; i<N; i++){
            findMax[i] = arr[i]+ i + 1;
            if(maxResult<findMax[i])
                maxResult= findMax[i];
        }

        System.out.println(maxResult + 1);


    }
}