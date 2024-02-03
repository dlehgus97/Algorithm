import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();
        int num1 =Integer.parseInt(A);
        int num2 =Integer.parseInt(B);

        int tmp1 = 0;
        int tmp2 = 0;
        int tmp3 = 0;

        for(int i = 0 ; i<A.length(); i++){
            tmp1+= (num1 % 10) * Math.pow(10,A.length() - i - 1);
            num1 /= 10;
        }

        for(int i = 0 ; i<B.length(); i++){
            tmp2+= (num2 % 10) * Math.pow(10,B.length() - i - 1);
            num2 /= 10;
        }

        int result = tmp1 +  tmp2 ;
        String str = Integer.toString(result);
        int num3 = 0;

        for(int i = 0 ; i<str.length(); i++){
            tmp3 += (result % 10) * Math.pow(10,str.length() - i - 1);
            result /= 10;
        }
        System.out.println(tmp3);
    }
}