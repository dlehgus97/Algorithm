import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        String result = "";
        
        for(int i = 0 ; i<str.length(); i++){
            if(str.charAt(i)<='Z'){
                result += (char)(str.charAt(i)+32);
            }
            else 
                result +=(char)(str.charAt(i)-32);
        }
        System.out.println(result);
    }
}