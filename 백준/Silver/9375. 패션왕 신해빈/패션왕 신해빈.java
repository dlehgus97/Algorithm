import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0 ; i <N; i++){
            int result = 1 ;
            int num = Integer.parseInt(br.readLine());
            HashMap<String,Integer>map = new HashMap<>();
            for(int j = 0 ; j <num; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                String str = st.nextToken();
                String word = st.nextToken();
                if(!map.containsKey(word)){
                    map.put(word,1);
                }
                else{
                    map.put(word,map.get(word) + 1);
                }
            }
            for(int s : map.values()){
                result *= s+1; //  null(옷 안입은 값도 추가해줘야함)
            }
            sb.append(result -1 ).append("\n"); // 전체 null 알몸은 제외해야함
        }
        System.out.println(sb);
    }
}