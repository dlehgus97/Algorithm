import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void  main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.toUpperCase();

        int arr[] = new int[26];
        for(int i = 0; i<arr.length; i++){
            arr[i] = 0;
        }
        int max = 0;
        char result = '?';

        for(int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            int num = (int) ch - 65;
            arr[num] += 1;
        }
        for(int i = 0; i<26; i++){
            if(max<arr[i]){
                max=arr[i];
                result = (char)(i+65);
                  }
            else if(max==arr[i])
                result = '?';
             }
System.out.println(result);
        }
 }
