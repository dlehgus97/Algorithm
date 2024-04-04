import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] arg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int [] arr = new int[N];
        int [] backArr = new int [N];
        int [] frontDp = new int [N];
        int [] backDp = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            backArr[N- i -1] = num;
            frontDp[i] = 1;
            backDp[i] = 1;
        }

        for(int i = 0 ; i<N ; i++){
            for(int j = 0 ; j<i ; j++){
                if(arr[i] > arr[j]){
                    frontDp[i] = Math.max(frontDp[i] , frontDp[j] + 1);
                }
            }
            for(int j = 0 ; j<i ; j++){
                if(backArr[i] > backArr[j]){
                    backDp[i] = Math.max(backDp[i] , backDp[j] + 1);
                }
            }
        }

        int maxResult = 0;

        for(int i = 0 ; i<N; i++){
            maxResult = Math.max(maxResult ,frontDp[i] + backDp[N - i -1]);
        }

        System.out.println(maxResult - 1);

    }
}