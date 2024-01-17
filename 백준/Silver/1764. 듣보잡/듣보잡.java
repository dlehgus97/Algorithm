import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String>set = new HashSet<>();


        for(int i = 0; i<N; i++){
            set.add(br.readLine());
        }

        ArrayList<String>result = new ArrayList<>();
        int total = 0;

        for(int i = 0 ; i<M; i++){
            String word = br.readLine();
            if(set.contains(word)){
                result.add(word);
                total ++;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(total).append("\n");

        Collections.sort(result);
        for(String str : result){
            sb.append(str).append("\n");
        }
        System.out.println(sb);
    }
}