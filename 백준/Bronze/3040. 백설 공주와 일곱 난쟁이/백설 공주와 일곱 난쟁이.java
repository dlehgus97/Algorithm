import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] arr = new int[9];

        int result = 0 ;

        for(int i = 0 ; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
            result += arr[i];
        }
        int num1 = 0;
        int num2 = 0;
        for(int i = 0 ; i<arr.length - 1; i++){
            for(int j = i+1; j<arr.length; j++){
                if(result - (arr[i] + arr[j]) == 100){
                    num1 = i;
                    num2 = j;
                    break;
                }
            }
        }

        for(int i = 0 ; i<arr.length; i++){
            if(i == num1 || i == num2){
                continue;
            }
            System.out.println(arr[i]);
        }
    }
}