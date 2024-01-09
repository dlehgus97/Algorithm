import java.io.BufferedReader;
import java.io.*;


public  class Main{

    static final int M =1234567891;

    public static void main(String [] args ) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());

        String word = br.readLine();

        long result = 0 ;
        long pow = 1;

         for(int i = 0 ; i<word.length(); i++){
                 result += ((word.charAt(i) - 96) * pow) % M ;
                 pow = (pow * 31) % M ;
         }
         System.out.println(result % M);
    }
}