import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();


        int [] arr = new int [str.length()];

        int result = 0 ;

        for(int i = 0 ; i<str.length(); i++){
            arr[i] = str.charAt(i)- '0';
            result += arr[i];
        }

        Arrays.sort(arr);

        if(arr[0] != 0 || result % 3 != 0){   //3의배수 조건 && 10의 배수조건 
            sb.append(-1);
        }
        else{
            for(int i = str.length() -1; i>=0; i--){
                sb.append(arr[i]);
            }
        }
        System.out.println(sb);
    }
}
