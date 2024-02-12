import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static StringTokenizer st;
    static int count;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        arr = new int[5][5];
        count = 0;

        int result = 1;

        for (int i = 0; i < arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                int num = Integer.parseInt(st.nextToken());
                for (int k = 0; k < 5; k++) {
                    for (int l = 0; l < 5; l++) {
                        if (arr[k][l] == num) {
                            arr[k][l] = 0;
                            break;
                        }
                    }
                }

                col();
                row();
                dig1();
                dig2();

                if(count>=3){
                    System.out.println(result);
                    return;
                }
                count = 0;
                result++;
            }
        }
    }

    public static void col() {
        for (int i = 0; i < 5; i++) {
            int cnt = 0;
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] == 0) {
                    cnt++;
                }
                if (cnt == 5) {
                    count++;
                }
            }
        }
    }

    public static void row() {

        for (int i = 0; i < 5; i++) {
            int cnt = 0;

            for (int j = 0; j < 5; j++) {
                if (arr[i][j] == 0) {
                    cnt++;
                }
                if (cnt == 5) {
                    count++;
                }
            }
        }
    }

    public static void dig1() {
        int cnt = 0;

        for (int i = 0; i < 5; i++) {
            if (arr[i][i] == 0) {
                cnt++;
            }
            if (cnt == 5) {
                count++;
            }
        }
    }


    public static void dig2() {
        int cnt = 0;

        for (int i = 0; i < 5; i++) {
            if (arr[i][4-i] == 0) {
                cnt++;
            }
            if (cnt == 5) {
                count++;
            }
        }
    }
}

