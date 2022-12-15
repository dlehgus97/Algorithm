class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = "";

        while(n !=0 ){
            str += Integer.toString(n%3);
            n /= 3;
        }
        for(int i = 1 ; i<=str.length(); i++){
            answer += (str.charAt(i-1)- '0') * (int)(Math.pow(3,str.length()-i));
        }

        return answer;
    }
}

//
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = "";
        int answer = 0;

        while(N !=0 ){
            str += Integer.toString(N%3);
            N /= 3;
        }
        for(int i = 1 ; i<=str.length(); i++){
            answer += (str.charAt(i-1)- '0') * (int)(Math.pow(3,str.length()-i));
        }

        System.out.println(answer);
    }
}
