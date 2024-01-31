import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int [] arr = new int[N];
        double sum = 0;

        for(int i = 0 ; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum +=arr[i];
        }

        Arrays.sort(arr);
        int num = N % 2 ;

        int count = 0 ;
        int max = Integer.MIN_VALUE;
        int result = arr[0] ;
        boolean check = false;


        for(int i = 0 ; i<N-1; i++){
            if(arr[i] == arr[i+1]){
                    count++;
            }
            else {
                count = 0;
            }
            if(count>max){
                max = count;
                result = arr[i];
                check = true;
            }
            else if(count == max && check == true){//두번째로 작은것에 check == true를 주고 나머지는 결국 다 false 다
                result = arr[i];        // count가 더 큰 수가 나타나기 전까지 결국 게속 false
                check = false;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(Math.round(sum/N)).append("\n");
        sb.append(arr[N/2]).append("\n");
        sb.append((result)).append("\n");
        sb.append(arr[N-1] - arr[0]).append("\n");

        System.out.println(sb);
    }
}