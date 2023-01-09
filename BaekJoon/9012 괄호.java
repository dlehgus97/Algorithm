import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args ) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i<N; i++){
            String str =br.readLine();
            String[] word = str.split("");
            int count = 0 ;
            for(int j = 0 ; j<str.length(); j++) {
                if (count == 0 && word[j].equals(")")) {
                    count = -1;
                    break;
                } else {
                    if (word[j].equals("(")) {
                        count++;
                    } else
                        count--;
                }
            }
            if(count == 0){
                sb.append("YES").append("\n");
            }
            else
                sb.append("NO").append("\n");
        }
        System.out.println(sb);
    }
}
