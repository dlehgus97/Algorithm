import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int count = 0 ;
        Arrays.sort(arr);
        int result = arr[0];

        while(count<3){
            count = 0;
              for(int i = 0 ; i<5; i++){
                  if(result % arr[i] == 0){
                      count++;
                  }
              }
              result++;
        }
        System.out.println(result - 1);
    }
}