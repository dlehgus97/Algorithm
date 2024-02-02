import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                sb.append(" ");
                continue;
            }
            else {
                if (str.charAt(i)  >= 65 && str.charAt(i) <= 90) {
                    if (str.charAt(i) + 13   > 90) {
                        sb.append((char)(str.charAt(i) + 13 - 90 + 64 ));
                    }
                    else{
                        sb.append((char)(str.charAt(i) + 13));
                    }
                } else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                        if(str.charAt(i)+ 13 >122){
                            sb.append((char)(str.charAt(i) + 13 - 122 + 96));
                        }
                        else{
                            sb.append((char)(str.charAt(i) + 13));

                        }
                }
                else {
                    sb.append(str.charAt(i));
                }
            }
        }
        System.out.println(sb);
    }
}