import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] arr = new int[42];
        int [] num = new int[10];

        for(int i = 0 ; i<10; i++){
            num[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0 ; i<num.length; i++){
            arr[num[i] % 42]++;
        }

        int result = 0;

        for(int i = 0 ; i<arr.length; i++){
            if(arr[i]>0){
                result++;
            }
        }

        System.out.println(result);
    }
}


