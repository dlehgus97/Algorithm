import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str ="";

        while(true){
            str = br.readLine();
            String result = "";
            if(str.equals("0")){
                break;
            }
            char[] word = str.toCharArray();

            for(int i = 0 ; i<word.length/2; i++){
                if(word[i] == word[(word.length-i-1)]){
                    result = "yes";
                }
                else {
                    result = "no";
                    break;
                }
            }
            if(word.length ==1)
                result = "yes";
                System.out.println(result);
        }

    }
}

// 숫자가 하나있을때도 팰린드롬수 이다 .!!
