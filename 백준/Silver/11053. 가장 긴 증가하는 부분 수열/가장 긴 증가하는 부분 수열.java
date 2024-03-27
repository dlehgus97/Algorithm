import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int [] arr = new int[N + 1];
        int [] dp = new int [N + 1];

        for(int i = 1; i<=N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0 ;
/*
dp[0]은 arr[0]을 0으로 설정 했기때문에  기준점 길이로 설정해준다.
각 배열 dp의 설정값은 0이다 . 그렇기 때문에 Math.max()를 해줘서 해당 배열값보다 작으면 그 앞선 
자릿수의 dp값 + 1 을 해주면 된다 .
그렇게 되면 같은 숫자는 같은 dp를 얻게 되버린다 .
즉 , 아래 예시를 보면 20이 두번 나오는데 10의 dp를 1로 정했으니 10과 20 사이에 숫자가 나오지않으면 
20 의 dp는 2 이다.

백준을 예시로하면
10 20 10 30 20 50
1  2  1  3  2  4   이렇게 되어버린다 .

실직적으로보면

0  10 20 10 30 20 50

0  1  2  1  3  2  4    -> 이러
 */
        for(int i = 0 ; i<=N; i++){
            for(int j = 0 ; j<i; j++){
                if(arr[i] > arr[j]){
                    dp[i] = Math.max(dp[i],dp[j] + 1);
                }
            }
            result = Math.max(result,dp[i]);
        }
        System.out.println(result);

    }
}