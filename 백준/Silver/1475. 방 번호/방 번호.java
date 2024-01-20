import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );

        int N = Integer.parseInt(br.readLine());

        int [] arr = new int[10];

        String str = Integer.toString(N);

        for(int i = 0 ; i<str.length(); i++){

            arr[(int)str.charAt(i) - '0'] ++;
        }

        int max = -1;

        for(int i = 0 ; i<=8; i++){
            if(i == 6){
                arr[6] = (arr[6] + arr[9]);
                if(arr[6] % 2 == 0){
                    arr[6] /= 2;
                }
                else
                    arr[6] = (arr[6] / 2) + 1;
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}