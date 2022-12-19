import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String [] month = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int [] day = {31,28,31,30,31,30,31,31,30,31,30,31};
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int total = M ;
        if(N>1) {
            for (int i = 0; i < N-1; i++) {
                total += day[i];
            }
        }
        System.out.println(month[total%7]);
    }
}
