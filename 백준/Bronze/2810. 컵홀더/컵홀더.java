import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        String tmp = "";

        for(int i = 0 ; i<N; i++){
            if(str.charAt(i) == 'S'){
                tmp += "*S";
            }
            else{
                tmp += "*LL";
                i++;
            }
        }
        tmp += "*";

        int count = 0 ;

        for(int i = 0 ; i<tmp.length(); i++){
            if(tmp.charAt(i) == '*'){
                count++;
            }
        }
        System.out.println(Math.min(count,N));
    }
}