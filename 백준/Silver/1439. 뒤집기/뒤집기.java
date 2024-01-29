import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();

       String [] arr = word.split("");
        int result_0 = 0;
        int result_1 = 0;

        if(word.charAt(0) == '0'){
            result_0++;
        }
        else if(word.charAt(0) == '1'){
            result_1++;
        }

        for(int i = 1 ; i<word.length(); i++){
            if(word.charAt(i-1) == '0' && word.charAt(i) == '1' ){
                result_1++;
            }
            else if(word.charAt(i-1) == '1' && word.charAt(i) == '0' ){
                result_0++;
            }
        }
        System.out.println(Math.min(result_0,result_1));
    }
}