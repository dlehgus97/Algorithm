import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        HashMap<Integer,Integer> map = new HashMap<>();
        int [] arr = new int[N];
        int [] sort_arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i<N; i++){
            int num  = Integer.parseInt(st.nextToken());
            arr[i] = sort_arr[i] = num;
        }

        Arrays.sort(sort_arr);

        int count = 0 ;

        for(int i = 0 ; i<N; i++){
            if(!map.containsKey(sort_arr[i])){
                map.put(sort_arr[i],count);
                count++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<N; i++){
            sb.append(map.get(arr[i])).append(" ");
        }
        System.out.println(sb);
    }
}