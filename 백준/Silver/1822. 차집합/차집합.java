import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();
        int[] arr2 = new int[B];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < A; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < B; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr2);

        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            int left = 0;
            int right = arr2.length - 1;
            int mid = 0;
            boolean check = false;
            while (left <= right) {
                mid = (left + right) / 2;

                if (num > arr2[mid]) {
                    left = mid + 1;
                } else if (num < arr2[mid]) {
                    right = mid - 1;
                } else {
                    check = true;
                    break;
                }
            }
            if (!check) {
                list2.add(num);
            }
        }

        if (list2.size() == 0) {
            System.out.println(0);
        } else {
            Collections.sort(list2);
            System.out.println(list2.size());
            for (int i = 0; i < list2.size(); i++) {
                System.out.print(list2.get(i) + " ");
            }
        }
    }
}