import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{
public static void  main(String []args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str =br.readLine();
    char [] arr = new char[str.length()];
    for(int i = 0 ; i<str.length(); i++){
        arr[i] =str.charAt(i);
    }
    Arrays.sort(arr);
    String word = String.valueOf(arr);
    String answer = "" ;
    for(int i = word.length() -1 ; i>=0; i--){
        answer += word.charAt(i);
    }
System.out.println(answer);
  }
}


//생각해보니까 굳이 String으로 안하고 그대로 출력해도 된다 .

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
public static void  main(String []args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str =br.readLine();
    char [] arr = new char[str.length()];
    for(int i = 0 ; i<str.length(); i++){
        arr[i] =str.charAt(i);
    }
    Arrays.sort(arr);
    for(int i = arr.length -1; i>=0; i--){
        System.out.print(arr[i]);
        }
    }
}
