import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st ;

        for(int i = 0 ; i<N ; i++){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int [] arr1 = new int[A];
            int [] arr2 = new int[B];

            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j<arr1.length; j++){
                arr1[j] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());

            for(int j = 0 ; j<arr2.length; j++){
                arr2[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            int result = 0 ;

            for(int j = 0 ; j<arr1.length; j++){
                int low = 0;
                int high = arr2.length - 1;

                int count = 0 ;

                while(low<=high){
                    int tmp = 0 ;
                    int mid = (low + high) / 2;

                    if(arr1[j]>arr2[mid]){
                        low = mid + 1;
                        count = mid + 1;
                    }
                    else {
                        high = mid - 1;
                    }

                }
                result += count;
            }
            System.out.println(result);
        }
    }
}