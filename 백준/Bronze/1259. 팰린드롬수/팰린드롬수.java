import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String str = br.readLine();

            if(str.equals("0")){
                break;
            }

            String result = "yes";

            for(int i = 0 ; i<str.length()/2; i++){
                if(str.charAt(i) != str.charAt(str.length()-i-1)){
                    result = "no";
                }
            }
            System.out.println(result);
        }
    }
}