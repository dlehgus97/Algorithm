import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int [] arr = new int[N +1];


        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i = 1 ; i<=N; i++){
            arr[i] = arr[i-1] + Integer.parseInt(st1.nextToken());
        }

        for(int i = 0 ; i<M; i++) {
            int result = 0;
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st2.nextToken()) ;
            int b = Integer.parseInt(st2.nextToken()) ;

            System.out.println(arr[b] - arr[a-1]);
            }
        }
    }

// 처음에 시간초과난 코드 .. 누적합 알고리즘을 통해 풀어줘야한다 .
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int [] arr = new int[N];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i = 0 ; i<N; i++){
            arr[i] = Integer.parseInt(st1.nextToken());
        }

        for(int i = 0 ; i<M; i++) {
            int result = 0;
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st2.nextToken()) - 1;
            int b = Integer.parseInt(st2.nextToken()) - 1;
            for (int k = a; k <= b; k++) {
                result += arr[k];
            }
            System.out.println(result);
            }
        }
    }
