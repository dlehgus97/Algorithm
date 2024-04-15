import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(0);
        list2.add(0);

        for(int i = 0 ; i<N ; i++){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if(A == 1){
                list1.add(B);
            }
            else{
                list2.add(B);
            }
        }
        list1.add(y);
        list2.add(x);

        Collections.sort(list1);
        Collections.sort(list2);

        int result = 0 ;

        for(int i = 0 ; i<list1.size() - 1 ; i++){
            for(int j = 0 ; j<list2.size() - 1 ; j++){
                int num = list1.get(i+1) - list1.get(i);
                int num2 = list2.get(j+1) - list2.get(j);
                result = Math.max(result , num* num2);
            }
        }
        System.out.println(result);
    }
}