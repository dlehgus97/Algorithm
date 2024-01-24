import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] arr = new int[9];

        int count = 0;
        for(int i = 0 ; i<9; i++){
            arr[i] = Integer.parseInt(br.readLine());
            count += arr[i];
        }

        int total = count - 100;

        Arrays.sort(arr);

        int tmp1 = 0;
        int tmp2 = 0;

        for(int i = 0 ; i<8; i++){
            for(int j = i+1; j<9; j++){
                if(arr[i] + arr[j] == total){
                    tmp1= i;
                    tmp2= j;
                    break;
                }
            }

        }
        for(int i = 0 ; i<9; i++){
            if(i != tmp1 && i != tmp2){
                System.out.println(arr[i]);
            }
        }
    }
}