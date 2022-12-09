import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        System.out.println((gcd(A,B)));
        System.out.println((A*B)/(gcd(A,B)));


    }
    static int gcd(int A,int B){
        if(B == 0){
            return A;
        }
        return gcd(B,A%B);
    }
}

/*
유클리드 호제법 
2개 수의 최대 공약수를 구하는 알고리즘이다. 
원리는 다음과 같다. 
자연수 a,b에 대해서 a를 b로 나눈 나머지를 r이라 한다면 a,b의 최대공약수와 b,r의 최대공약수는 같다. 
이 성질에 따라 a를 b로 나눈 나머지 r을 구하고, b를 r로 나눈 나머지 r'을 구한다.  
나머지가 0이 될때 나눈 수가 a,b의 최대공약수가 된다. 
 
유클리드 호제법으로 최대 공약수를 구한 다음, 최소 공배수는 다음 식에 의해 구할 수 있다. 
최소 공배수 : (a ✕ b) / (최대 공약수)
