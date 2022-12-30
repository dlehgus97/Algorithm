import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] arr = new int[9];
        int result = 0 ;
        for(int i = 0 ; i<9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr [i] = Integer.parseInt(st.nextToken());
            result += arr[i];
        }
        Arrays.sort(arr);
        int num1 = 0;
        int num2 = 0;

        for(int i = 0 ; i<=7; i++){
            for(int j = i+1; j<=8; j++){
                if(result - (arr[i] + arr[j]) == 100){
                    num1 = i;
                    num2 = j;
                    break;
                }
            }
        }
        for(int i = 0 ; i<num1; i++){
            System.out.println(arr[i]);
        }
        for(int i = num1 +1 ; i<num2; i++){
            System.out.println(arr[i]);
        }
        for(int i = num2+1; i<9; i++){
            System.out.println(arr[i]);
        }

    }
}

//급하게 코드를 짜다보니 .. 아래 for문을 잘못했다. 아래처럼 하면 될 것 을 ..
  for(int i = 0 ; i<9; i++){
            if(i != num1 && i != num2){
                System.out.println(arr[i]);
            }
        }
