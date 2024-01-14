import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<Integer,String> map_1 = new HashMap<>();
        HashMap<String,Integer> map_2 = new HashMap<>();

        for(int i = 0 ; i<N; i++){
            String str = br.readLine();
            map_1.put(i,str);
            map_2.put(str,i);
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i<M; i++){
            String str = br.readLine();
            if(Character.isDigit(str.charAt(0))){
                sb.append(map_1.get((Integer.parseInt(str))-1)).append("\n");
            }
            else{
                sb.append(map_2.get(str)+1).append("\n");
            }
        }
        System.out.println(sb);
    }
}
