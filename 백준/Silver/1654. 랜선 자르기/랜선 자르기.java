import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int [] arr = new int[K];

        for(int i = 0 ; i <arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        long lo = 1;
        long hi = arr[K-1];

        while(lo<=hi){
            long count = 0 ;

            long mid = (lo + hi) / 2;

            for(int i = 0 ; i<K; i++){
                count += arr[i] /mid ;
            }
            if(count < N){ // 숫자들이 커서 나눴을떄 몇개 안나오는거니까 hi 를 줄여 count 를 늘여야한다.
                hi = mid - 1;
            }
            else{ // 숫자들이 같거나 작아서 나눴을떄 너무 많이 나오는것 lo 를 늘려 count 를 줄여야한다.
                lo = mid + 1; // 최댓값을 찾기 위해서 같을떄도 줄여준다 .
            }
        }

        System.out.println(hi);
    }
}