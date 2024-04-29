import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int mt = Integer.parseInt(br.readLine());

        int[][] arr = new int[mt][2];
        for(int i =0; i< mt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
                int startt = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                arr[i][0] = startt;
                arr[i][1] = end;
        }
        //정렬 ( 종료시간 기준 정렬)
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });
        int endtime = -1;
        int count =0;
        for(int i =0; i < mt; i++) {
            if(endtime <= arr[i][0]) {

                endtime = arr[i][1];
                count++;
            }
        }
        System.out.println(count);
    }


}