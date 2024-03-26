import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();

        String [] arr = {"A+" , "A0" , "A-" , "B+" , "B0" , "B-" , "C+" , "C0" , "C-" , "D+" , "D0" , "D-" , "F"};
        Double [] score = {4.3 , 4.0 , 3.7 , 3.3 , 3.0 , 2.7 , 2.3 , 2.0 , 1.7,  1.3 , 1.0 , 0.7, 0.0};
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i].equals(str)){
                sb.append(score[i]);
                break;
            }
        }
        System.out.println(sb);
    }
}