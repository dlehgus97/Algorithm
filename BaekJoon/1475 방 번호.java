import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.replaceAll("9","6");
        int N = Integer.parseInt(str);
        int [] arr = new int[9];

        int tmp = N;
        while(tmp>0){
            arr[tmp % 10]++;
            tmp /= 10;
        }
      
        int result = -1;
      
        if(arr[6] %2 == 0){
            arr[6] /= 2;
        }
        else {
            arr[6] = (arr[6]/2) + 1;
        }

        for(int i = 0 ; i<9; i++){
            if(arr[i]>result){
                result = arr[i];
            }
        }
        System.out.println(result);
    }
}
