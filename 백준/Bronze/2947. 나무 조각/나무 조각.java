import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public  static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] arr = new int[5];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int n = arr.length;

        for(int i=1;i<n;i++) {
            for (int j = 0; j < n-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    for(int k = 0 ; k<5; k++){
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
    private static void swap(int[] arr, int i, int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}