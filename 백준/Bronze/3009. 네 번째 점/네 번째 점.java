import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] arr_1 = new int[1001];
        int [] arr_2 = new int[1001];

        for(int i = 0 ; i<3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr_1[Integer.parseInt(st.nextToken())] +=1;
            arr_2[Integer.parseInt(st.nextToken())] +=1;
        }
        for(int i = 0 ; i<1001; i++){
            if(arr_1[i] == 1){
                System.out.print(i+ " ");
            }
        }
        for(int i = 0 ; i<1001; i++){
            if(arr_2[i] == 1){
                System.out.print(i);
            }
        }

    }
}
