import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        String ans = br.readLine();

        int num = word.length() / ans.length();

        word = word.replace(ans,"-");

        int result = 0 ;
        for(int i = 0 ; i<word.length(); i++){
            if(word.charAt(i) == '-'){
                result++;
            }
        }
        System.out.println(result);
    }
}