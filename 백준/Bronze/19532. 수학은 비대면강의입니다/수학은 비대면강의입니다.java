import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr_1 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        int[] arr_2 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

        int X = ((arr_1[2] *arr_2[1]) - (arr_2[2]*arr_1[1]))/ ((arr_1[1] *arr_2[0]) - (arr_2[1]*arr_1[0])) ;
        int Y = ((arr_1[2] *arr_2[0]) - (arr_2[2]*arr_1[0])) / ((arr_1[1] *arr_2[0]) - (arr_2[1]*arr_1[0])) ;
        
        System.out.print(-X +" ");
        System.out.print(Y +" ");
    }


}