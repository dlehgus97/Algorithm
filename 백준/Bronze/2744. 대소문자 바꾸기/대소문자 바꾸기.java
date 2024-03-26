import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine() ;

        String result = "";

        for(int i = 0 ; i<word.length() ; i++){
            char tmp = word.charAt(i);
            if(tmp > 96){
                result += (char)(tmp-32);
            }
            else{
                result += (char)(tmp + 32);
            }
        }
        System.out.println(result);
    }
}