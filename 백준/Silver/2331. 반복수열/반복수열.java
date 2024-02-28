import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        HashMap<Integer,Integer>map = new HashMap<>();
        int result;
        map.put(A,1);
        int num = 2;


        while(true){
            result = 0;

            while(A>0){
                result += Math.pow(A % 10,P);
                A /= 10;
            }
            if(!map.containsKey(result)){
                map.put(result,num);
                num++;
            }
            else{
                break;
            }
            A = result;
        }

        System.out.println(map.get(result) - 1);
    }
}