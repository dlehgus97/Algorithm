import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];
        boolean[] check = new boolean[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });
        PriorityQueue<Integer> pq = new PriorityQueue<>();  // 종료 시간을 기준으로 자동정렬 하기위해 사용한다 .

        pq.add(arr[0][1]);   // 기준이 되는 첫번째 시간

        for (int i = 1; i < N; i++) {
            if (pq.peek() <= arr[i][0]) {       // 정렬된 시작 순서가 종료된 시간보다 크면 제거해준다
                pq.poll();
            }
            pq.add(arr[i][1]);      //계속해서 추가해준다 (위에서 제거 해주기때문에 추가가 가능한것)
        }
        System.out.println(pq.size());
    }
}

/* 이중 for문을 사용해서 시간초과가 나왔다. 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];
        boolean[] check = new boolean[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });

        int count = 0;

        for (int i = 0; i < N; i++) {
            if (check[i]) {
                continue;
            }
            int pre = arr[i][1];
            count++;
            for (int j = i + 1; j < N; j++) {
                if (!check[j] && pre <= arr[j][0]) {
                    check[j] = true;
                    pre = arr[j][1];
                }
                ;
            }
        }
        System.out.println(count);
    }
}*/