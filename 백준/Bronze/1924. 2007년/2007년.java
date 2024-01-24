import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] day  = {31,28,31,30,31,30,31,31,30,31,30,31};
        String []  str =  {"SUN","MON","TUE","WED","THU","FRI","SAT"};

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if(N == 1){
            System.out.println(str[M % 7]);
        }
        else {
            int tmp = M;
            for(int i = 0 ; i<N -1; i++){
                tmp += day[i];
            }
            System.out.println(str[tmp % 7]);
        }
    }
}