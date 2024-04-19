import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static ArrayList<Integer>list ;

    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        list = new ArrayList<>();

        isPrime(N);

        list.add(0); // 끝에 더 못 가게 어차피 여기보다 작으면 답이 안나옴

        int start = 0 ;
        int end = 0;

        int total = 0 ;
        int result = 0 ;


        while(end != list.size()){
            if(total<N){
                total += list.get(end);
                end++;
            }
            else if(total > N){
                total -= list.get(start);
                start++;
            }
            else{
                total += list.get(end);
                end ++;
                result++;
            }
        }
        System.out.println(result);
    }

    public static void isPrime(int a){

        for (int i = 2; i <= a; i++) {
            boolean check = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                list.add(i);
            }
        }
    }
}