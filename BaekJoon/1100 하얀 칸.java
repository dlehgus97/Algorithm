import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] str = new String[8][8];

        for(int i = 0; i<8; i++){
            String [] word = br.readLine().split("");
            for(int j = 0 ; j<8; j++){
                str[i][j] = word[j];
            }
        }

        int result = 0 ;

        for(int i = 0 ; i<8; i++){
            for(int j = 0 ;j<8; j++){
                if((i+j) % 2 == 0 && str[i][j].equals("F")){ //흰색칸은 i+j 가 짝수이다.
                    result++;
                }
            }
        }
System.out.println(result);
    }
}
