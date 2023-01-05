//StringBuilder로 	572ms
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String,String> map = new HashMap<>();

        for(int i = 0 ; i<N; i++){
            String name = br.readLine();
            String num = Integer.toString(i+1);
            map.put(name,num);
            map.put(num,name);
        }
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i<M; i++){
            sb.append(map.get(br.readLine()) + "\n");
        }
        System.out.println(sb);
    }
}

//System.out.println 바로 할 때 1172 ms
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String,String> map = new HashMap<>();

        for(int i = 0 ; i<N; i++){
            String name = br.readLine();
            String num = Integer.toString(i+1);
            map.put(name,num);
            map.put(num,name);
        }
        

        for(int i = 0 ; i<M; i++){
            System.out.println(map.get(br.readLine()));
        }
    }
}

// map 을 사용안하고 배열로 바로 했을 때 --> 시간초과 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String [] str =new String[N];

        for(int i = 0 ; i<N; i++){
            str[i] = br.readLine();
        }
        String[] word = new String[M];
        for(int i = 0 ; i<M; i++){
            word[i] = br.readLine();
            for(int j = 0 ; j<N; j++){
                if(word[i].equals(Integer.toString(j))){
                    System.out.println(str[j-1]);
                }
                else if(word[i].equals(str[j])){
                    System.out.println(j+1);
                }
            }
        }
    }
}
