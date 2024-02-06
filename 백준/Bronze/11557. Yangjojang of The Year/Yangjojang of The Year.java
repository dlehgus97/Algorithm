import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i<N; i++){
            int T = Integer.parseInt(br.readLine());
            int max = Integer.MIN_VALUE;
            String result = "";

            for(int j = 0 ; j<T; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                String str = st.nextToken();
                int num = Integer.parseInt(st.nextToken());
                HashMap<String, Integer> map = new HashMap<>();

                if (map.containsKey(str)) {
                    map.put(str, map.get(str) + num);
                }
                else {
                    map.put(str, num);
                }

                if(max<map.get(str)){
                    max = map.get(str);
                    result = str;
                }
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}