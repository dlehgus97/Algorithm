class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 1;
         while(true){
            int result = 1;
            for(int i = num ; i>1; i--){
                result *= i;
            }
            if(result>n){
                answer = num-1;
                break;
            }
            else if(result == n){
                answer = num;
                break;
            }
            num++;
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
        int num = 1;
        int answer;
        int result = 1;

        while(true){
            result *= num;
            if(result>N){
                answer = num-1;
                break;
            }
            else if(result == N){
                answer = num;
                break;
            }
            num++;
        }
System.out.println(answer);
    }
}
