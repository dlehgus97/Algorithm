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

        int [] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        long lo = 1;
        long hi = arr[N-1];
        long mid = 0;

        StringBuilder sb = new StringBuilder();

        while(lo<=hi){
            mid = (lo + hi) / 2; // 안자르는 나무 ( arr[i] - mid == 자른나무)
            long count = 0 ;

            for(int i = 0 ; i <arr.length; i++) {
                if (mid < arr[i]) {
                    count += arr[i] - mid ;
                }
            }
            if(count >= M){
                lo = mid + 1;
            }
            else if(count < M){
                hi = mid - 1;
            }
        }
        System.out.println(hi); // M과 동일하지 않을때 결국 hi == mid -1 이되기때문에 
    }
}