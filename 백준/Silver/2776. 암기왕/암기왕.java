import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static StringTokenizer st;
    static int [] arr1;

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i<T ; i++){
            int N = Integer.parseInt(br.readLine());
            arr1 = new int[N];
            st = new StringTokenizer(br.readLine());

            for(int j = 0 ; j<N; j++){
                arr1[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr1);
            int M = Integer.parseInt(br.readLine());
            int [] arr2 = new int[M];
            st = new StringTokenizer(br.readLine());

            StringBuilder sb = new StringBuilder();

            for(int j = 0 ; j<M; j++){
                arr2[j] = Integer.parseInt(st.nextToken());
                sb.append(binarySearch(arr2[j])).append("\n");
            }
            System.out.println(sb.deleteCharAt(sb.length() - 1) );
        }
    }
    public static int binarySearch(int a){
        int lo = 0;
        int hi = arr1.length -1;

        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(a > arr1[mid]){
                lo = mid + 1;
            }
            else if(a<arr1[mid]){
                hi = mid - 1;
            }
            else{
                return 1;
            }
        }
        return 0;
    }
}