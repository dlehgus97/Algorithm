import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashMap<String,Integer>map = new HashMap<>();

        for(int i = 0 ; i<N; i++){
            String word = br.readLine();
            if(map.containsKey(word)){
                map.put(word,map.get(word) + 1);
            }
            else{
                map.put(word,1);
            }
        }
        ArrayList<String>list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        int max = Integer.MIN_VALUE;
        String result = "";
        for(int i = 0 ; i<list.size(); i++){
            if(map.get(list.get(i))>max){
                max = map.get(list.get(i));
                result = list.get(i);
            }
        }
        System.out.println(result);
    }
}