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
        int max = 0;
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i = 0 ; i<N; i++){
            arr[i] = Integer.parseInt(st1.nextToken());
        }
        for(int i = 0 ; i<N-2; i++){
            for(int j = i+1 ; j<N-1; j++){
                for(int k = j+1; k<N; k++){
                    int result = arr[i] + arr[j] + arr[k] ;
                    if(result>max && result<=M)
                        max = result;
                }
            }
        }
        System.out.println(max);


    }
}

/*  for(int k = j+1; k<N; k++) 이 부분을 처음에는 for(int k = i+2 ; k<N; k++) 이렇게 반복문의 조건을 설정했지만 오답..
반례를 생각해보니 4 10     를 입력 했을때 7 이 나오는것을 확인..
                1 2 3 10
아마 배열이 (0 1 2) (0 1 3) (0 2 2) (0 2 3) (1 2 3) 이렇게 된 것으로 확인 ..
무조건 j보다 커야 하기 떄문
 */
                 
