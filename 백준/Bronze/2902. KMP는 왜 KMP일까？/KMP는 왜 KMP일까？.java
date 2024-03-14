import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine()  ;

        String [] arr = str.split("-");

        String result = "";

        for(int i = 0 ; i<arr.length; i++){
            result += arr[i].charAt(0);
        }

        System.out.println(result);
    }
}