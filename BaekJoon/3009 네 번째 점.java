import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String []args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [][] arr = new int[1001][1001]; //숫자는 1부터 1000 까지지만 배열은 0부터 시작하므로 0<= [][]<=1000 1001개

        for(int i = 0 ; i<3; i++){
        StringTokenizer st =new StringTokenizer(br.readLine());
        arr[Integer.parseInt(st.nextToken())][0]++;
        arr[0][Integer.parseInt(st.nextToken())]++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ;i<=1000; i++){
            if(arr[i][0] ==1){
                sb.append(i).append(" ");
            }
        }
        for(int i = 0 ;i<=1000; i++){
            if(arr[0][i] ==1){
                sb.append(i);
            }
        }
        System.out.println(sb);


    }
}
