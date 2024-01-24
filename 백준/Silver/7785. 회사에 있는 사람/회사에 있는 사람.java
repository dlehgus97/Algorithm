import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashSet <String> set = new HashSet<>();

        for(int i = 0 ; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String word = st.nextToken();
            if (word.equals("enter")) {
                set.add(name);
            }
            else if(word.equals("leave")) {
                set.remove(name);
            }
        }
        ArrayList<String> list = new ArrayList<>(set);

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();

        for(int i = list.size() -1 ; i>=0; i--){
            sb.append(list.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}