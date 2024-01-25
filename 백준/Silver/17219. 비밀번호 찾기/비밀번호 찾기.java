import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String,String> hm = new HashMap<>();

        for(int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            hm.put(st.nextToken(),st.nextToken());
        }

        for(int i = 0 ; i<M; i++){
            String str = br.readLine();
            sb.append(hm.get(str)).append("\n");
        }
        System.out.println(sb);
    }
}