import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int [] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum1 = 0;
        int sum2 = 0;
        int max1 = 0;
        int max2 = 0;

        for(int i = 0 ; i<arr.length - 1; i++){
            if(arr[i]<=arr[i+1]){
                sum1++;
                if(sum1>max1){
                    max1 = sum1;
                }
            }
            if(arr[i]>= arr[i+1]){
                sum2++;
                if(sum2>max2){
                    max2 = sum2;
                }
            }
            if(sum1>0 && arr[i]>arr[i+1]){
                sum1 = 0;
            }
            if(sum2>0 && arr[i]<arr[i+1]){
                sum2 = 0;
            }
        }

        int num = max1>max2 ? max1 + 1 : max2 + 1 ;
        System.out.println(num);
    }
}