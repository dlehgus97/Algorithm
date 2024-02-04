import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 1 ; i<=8; i++){
            int num = Integer.parseInt(br.readLine());
            map.put(num,i);
        }

        ArrayList<Integer> arr = new ArrayList<>(map.keySet());

        Collections.sort(arr);
        int result = 0;

        int [] ans = new int[5];

        for(int i = 0 ; i<5; i++){
            result += arr.get(i+3);
            ans[i] = map.get(arr.get(i+3));
        }

        Arrays.sort(ans);

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        sb1.append(result);

        for(int i = 0 ; i<5; i++){
            sb2.append(ans[i]).append(" ");
        }
        System.out.println(sb1);
        System.out.println(sb2);
    }
}