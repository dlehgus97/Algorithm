import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double result = 0;
        double  total = 0;

        for(int i = 0 ; i<20; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String word = st.nextToken() ;
            double score = Double.parseDouble(st.nextToken());
            String str = st.nextToken() ;
            double tmp = 0;

            if(str.equals("P")){
                continue;
            }
            else {
                if (str.equals("A+")) {
                    tmp = 4.5;
                } else if (str.equals("A0")) {
                    tmp = 4.0;
                } else if (str.equals("B+")) {
                    tmp = 3.5;
                } else if (str.equals("B0")) {
                    tmp = 3.0;
                } else if (str.equals("C+")) {
                    tmp = 2.5;
                } else if (str.equals("C0")) {
                    tmp = 2.0;
                } else if (str.equals("D+")) {
                    tmp = 1.5;
                } else if (str.equals("D0")) {
                    tmp = 1.0;
                } else if (str.equals("F")) {
                    tmp = 0.0;
                }
            }
                result += score * tmp;
                total += score ;


        }
        System.out.printf("%.6f\n", result/total);
    }
}

