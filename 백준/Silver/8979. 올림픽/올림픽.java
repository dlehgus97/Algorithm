import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][4];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
            arr[i][3] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    if (o1[2] == o2[2]) {
                        return o2[3] - o1[3];
                    } else {
                        return o2[2] - o1[2];
                    }
                } else {
                    return o2[1] - o1[1];
                }
            }
        });

        int result = 1;
        int turn = 0 ;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == K) {
                turn = i;
                break;
            }
        }


        for(int i = 0 ; i<arr.length; i++){
            if(arr[i][1] == arr[turn][1] && arr[i][2] == arr[turn][2] && arr[i][3] == arr[turn][3]){
                result += i;
                break;
            }
        }

        System.out.println(result);
    }
}