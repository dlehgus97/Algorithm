import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        String word = str.replaceAll("XXXX","AAAA");
        String answer = word.replaceAll("XX","BB");

        if(answer.contains("X")){
            sb.append(-1);
        }
        else{
            for(int i = 0 ; i<answer.length(); i++){
                sb.append(answer.charAt(i));
            }
        }
        System.out.println(sb);
    }
}