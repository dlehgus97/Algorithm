import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i<str.length(); i++){
            if(str.charAt(i) == 'S'){
                sb.append("*S");
            }
            else{
                sb.append("*LL");
                i++;
            }
        }
        sb.append("*");

        int num = 0;

        for(int i = 0 ; i<sb.toString().length(); i++){
            if(sb.toString().charAt(i) == '*'){
                num++;
            }
        }
        System.out.println(Math.min(num,N));
    }
}