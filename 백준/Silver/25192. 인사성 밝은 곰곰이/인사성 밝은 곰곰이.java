import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        HashSet<String>set = new HashSet<>();

        int result = 0 ;

        for(int i = 0 ; i<N; i++){
            String word = br.readLine();

            if(word.equals("ENTER")) {
                    set = new HashSet<>();
            }
            else if(!set.contains(word)){
                set.add(word);
                result++;
            }
        }
        System.out.println(result);
    }
}