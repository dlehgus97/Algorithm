import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int result = 0 ;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        hanoi(N,1,3);

        System.out.println(result);
        System.out.println(sb.substring(0,sb.length() - 1));
    }
    public static void hanoi(int N , int X , int Y){
        result ++;

        if(N>1){
            hanoi(N-1,X,6-X-Y);
        }
        sb.append(X).append(" ").append(Y).append("\n");
        if(N>1){
            hanoi(N-1 , 6 - X - Y,Y);
        }
    }
}