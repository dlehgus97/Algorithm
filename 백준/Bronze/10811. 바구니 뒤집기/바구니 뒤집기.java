import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [] arr = new int[N];

        for(int k = 0 ; k<N; k++){
            arr[k] = k+1  ;
        }

        for(int k  = 0 ; k<M; k++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            int gap = 0;

            if((j - i) % 2 == 0){
                gap = (j - i) / 2;
            }
            else {
                gap = ((j - i) / 2) + 1 ;
            }
            for(int z = 0 ; z<gap; z++) {
                int tmp = arr[i-1+z];
                arr[i-1+z] = arr[j-1-z];
                arr[j-1-z] = tmp;
            }
        }
        for(int i = 0 ; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

