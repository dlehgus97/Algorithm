import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        int result = 0;

        for (int i = 2; i <= N; i++) {
            arr1.add(i);
        }

        for (int i = 2; i <=N; i++) {
            for (int j = 0; j < arr1.size(); j++) {
                if(arr1.get(j) % i == 0){
                    result ++;
                    if(result == K){
                        System.out.println(arr1.get(j));
                        break;
                    }
                    arr1.remove(j);
                }
            }
        }
    }
}
