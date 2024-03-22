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


        HashMap<String,Integer>map = new HashMap<>();

        for(int i = 0 ; i<N; i++){
            String word = br.readLine();
            if(word.length() < M){
                continue;
            }
            if(!map.containsKey(word)){
                map.put(word,1);
            }
            else{
                map.put(word,map.get(word) + 1);
            }
        }

        List<String>keySet = new ArrayList<>(map.keySet());


Collections.sort(keySet, new Comparator<String>() {
    @Override
    public int compare(String o1, String o2) {

        if(Integer.compare(map.get(o2),map.get(o1)) ==0){
            if(o1.length() == o2.length()){
                return o1.compareTo(o2);
            }
            return o2.length() - o1.length();
        }
        return Integer.compare(map.get(o2),map.get(o1));
    }
});


    StringBuilder sb = new StringBuilder();


    for(String str : keySet){
        sb.append(str + "\n");
        }
        System.out.println(sb);

    }
}