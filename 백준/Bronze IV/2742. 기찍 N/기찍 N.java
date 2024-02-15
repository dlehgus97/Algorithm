import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer>list = new ArrayList<>();

        for(int i = 1 ; i<=N; i++){
            list.add(i);
        }

        Collections.sort(list, Collections.reverseOrder());

        for(int num : list){
            System.out.println(num);
        }
    }
}