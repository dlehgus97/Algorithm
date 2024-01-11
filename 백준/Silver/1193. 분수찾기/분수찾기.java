import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());


        int tmp = 1;
        int num = 1;

        if (N == 1){
            System.out.println(1+"/"+1);
        }
        else {
            while (true) {
                tmp++;
                num += tmp;
                if (num >= N) {
                    if (tmp % 2 == 0) {
                        int total = num - N;
                        System.out.println(tmp - (total ) + "/" + (1+(total)));
                        break;
                    }
                    else {
                        int total = num - N;
                        System.out.println((1+(total) + "/" + (tmp - (total) )));
                        break;
                    }
                }
            }
        }
    }
}

