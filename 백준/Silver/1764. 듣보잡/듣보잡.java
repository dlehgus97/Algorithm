import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<String>();
        List <String > list = new ArrayList<String>();

        for(int i = 0 ; i<N; i++){
            set.add(br.readLine());
        }
        for(int i = 0 ; i<M; i++){
           String str = br.readLine();
           if(set.contains(str)){
               list.add(str);
           }
        }
        Collections.sort(list);

        StringBuilder sb =new StringBuilder();
        sb.append(list.size()+ "\n");
        for(int i = 0 ; i< list.size(); i++){
            sb.append(list.get(i)+"\n");
        }
System.out.println(sb);


    }
}