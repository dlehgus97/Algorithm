import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String []args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int [] arr = new int[3] ;
        int num;

        for(int i = 0 ; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j<3; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            if(arr[2] % arr[0] ==0 )
                System.out.println((arr[0] *100) + (arr[2]/arr[0]) );
            else 
                System.out.println((arr[2]%arr[0]) *100 + (arr[2]/arr[0]) + 1);

        }
    }
}

/*굳이 배열로 풀지않고 반복문 없이
int H = Integer.parseInt(br.readLine());
int W = Integer.parseInt(br.readLine());
int N = Integer.parseInt(br.readLine());
이렇게 해도 될을 것 같다 .. */
