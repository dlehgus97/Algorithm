import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[]word = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int result = 0;

        for(int i = 0 ; i<word.length; i++){
            if(str.contains(word[i])){
                str = str.replaceAll(word[i], "*");

            }
        }

System.out.println(str.length());
    }
}
