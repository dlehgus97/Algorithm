import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st ;

        int [] dis = new int[N - 1];
        int [] price = new int [N];

        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i<dis.length; i++){
            dis[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i<price.length; i++){
            price[i] = Integer.parseInt(st.nextToken());
        }

        long answer = 0;
        long minPrice = (long)price[0];

        for(int i = 0 ; i<N - 1; i++){
            if(price[i]<minPrice){
                minPrice = (long)price[i];
            }
            answer += minPrice * dis[i];
        }
        System.out.println(answer);
    }
}