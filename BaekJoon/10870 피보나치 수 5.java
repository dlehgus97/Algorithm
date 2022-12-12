import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(fib(N));
    }
    static int fib(int a){
        if(a<=1){
            return a;
        }
        else
           return fib(a-2) + fib(a-1);
    }
}

//0일때랑 1일떄랑 고정인걸 생각해야한다 
