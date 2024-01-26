import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashSet<Integer>set = new HashSet<>();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if(str.equals("add")){
                set.add(Integer.parseInt(st.nextToken()));
            }
            else if(str.equals("remove")){
                int num = Integer.parseInt(st.nextToken());
                if(set.contains(num)){
                    set.remove(num);
                }
                else{
                    continue;
                }
            }
            else if(str.equals("check")){
                int num = Integer.parseInt(st.nextToken());
                if(set.contains(num)){
                    sb.append(1).append("\n");
                }
                else {
                    sb.append(0).append("\n");
                }
            }
            else if(str.equals("toggle")){
                int num = Integer.parseInt(st.nextToken());
                if(set.contains(num)){
                    set.remove(num);
                }
                else{
                    set.add(num);
                }
            }
            else if(str.equals("all")){
                for(int j = 1; j<=20; j++){
                    set.add(j);
                }
            }
            else if(str.equals("empty")){
                    set.removeAll(set);
            }
        }
        System.out.println(sb);
    }
}