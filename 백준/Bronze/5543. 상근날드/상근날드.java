import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] arr1 = new int[3];
        int [] arr2 = new int[2];

        for(int i = 0 ; i<3; i++){
            arr1[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0 ; i<2; i++){
            arr2[i] = Integer.parseInt(br.readLine());
        }

        int result = Integer.MAX_VALUE ;
        for(int i = 0; i<3; i++){
            int num = 0;
            for(int j = 0 ; j<2; j++){
                num = arr1[i] + arr2[j];
                result = Math.min(result,num);
            }
        }
        System.out.println(result - 50);
    }
}