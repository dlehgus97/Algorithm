import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        HashMap<Long,Integer>map = new HashMap<>();

        for(int i = 0 ; i<N; i++){
            long num = Long.parseLong(br.readLine());
            if(map.containsKey(num)){
                map.put(num,map.get(num) + 1);
            }
            else{
                map.put(num,1);
            }
        }
        int max = Integer.MIN_VALUE;
        long result = 0 ;

        ArrayList<Long>list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        for(int i = 0 ; i<list.size(); i++){
            if(map.get(list.get(i))>max){
                max = map.get(list.get(i));
                result = list.get(i);
            }
        }
        System.out.println(result);
    }
}