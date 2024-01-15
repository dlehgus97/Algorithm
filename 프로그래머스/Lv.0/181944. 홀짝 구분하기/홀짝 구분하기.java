import java.util.*;
import java.io.*;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        if(N % 2 == 0){
            System.out.print(N + " is even");
        }
        else 
            System.out.print(N + " is odd");
        
    }
}