import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if (A == 1) {
                for (int j = 1; j <= N / B; j++) {
                    int index = (j * B) - 1;
                    if (arr[index] == 1) {
                        arr[index] = 0;
                    } else {
                        arr[index] = 1;
                    }
                }
            } else if (A == 2) {

                int tmp = 0;
                int index1 = B - 1 - tmp;
                int index2 = B - 1 + tmp;

                if(arr[index1] == 1){
                    arr[index1] = 0;
                }
                else {
                    arr[index2] = 1;
                }

                while (true) {
                    tmp++;
                    index1 = B - 1 - tmp;
                    index2 = B - 1 + tmp;

                    if (index1 < 0 || index2 >=N){
                        break;
                    }
                    if(arr[index1] == arr[index2]){
                        if(arr[index1] == 1){
                            arr[index1] = 0;
                            arr[index2] = 0;
                        }
                        else if (arr[index1] == 0){
                            arr[index1] = 1;
                            arr[index2] = 1;
                        }
                    }
                    else {
                        break;
                    }

                }
            }
        }
        for(int i = 1 ; i<=N; i++){
            System.out.print(arr[i-1] + " ");
            if(i % 20 == 0){
                System.out.println();
            }
        }
    }
}