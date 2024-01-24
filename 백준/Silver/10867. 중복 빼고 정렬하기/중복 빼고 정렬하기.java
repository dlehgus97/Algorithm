import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0 ; i<N; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        List<Integer> li = new ArrayList<>(set);
        
        Collections.sort(li);
        
        for(int i = 0 ; i<set.size(); i++){
            System.out.print(li.get(i) + " ");
        }
    }
}