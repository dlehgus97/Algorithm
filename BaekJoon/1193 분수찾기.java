import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String []args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int line = 0;
        int end = 0; //끝 범위
        
        while(X>end){
            line++;
            end+=line;
        }
        int left_num = end-X;

        if(line%2 == 0){
            System.out.println((line-left_num) +"/"+(1+left_num));
        }
        else
            System.out.println((1+left_num) +"/"+(line-left_num));
    }

}
