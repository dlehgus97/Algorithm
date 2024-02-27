import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public  class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int [] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int [] result = new int[arr.length];

        for(int i = 0 ; i<arr.length; i++){
            for(int j = 0 ; j<arr.length; j++){
                if(i>j && arr[i] == arr[j]){
                    result[i]++;
                }
                if(arr[i] > arr[j]){
                    result[i]++;
                }
            }
        }
        for(int i = 0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}