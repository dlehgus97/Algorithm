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
        int B= Integer.parseInt(st.nextToken());

        int [][] arr = new int[N][M];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i<arr.length; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j<arr[i].length; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j]> max ) {
                    max = arr[i][j];
                }
                if(arr[i][j]< min){
                    min = arr[i][j];
                }
            }
        }

        int result = Integer.MAX_VALUE;
        int height = 0;

        for(int h = max ; h>=min; h--){
            int time = 0 ;
            int block = B;
            for(int i = 0 ; i<arr.length; i++){
                for(int j = 0 ; j<arr[i].length; j++){
                    if(h - arr[i][j] > 0){
                        time += h - arr[i][j];
                        block -= h - arr[i][j];
                    }
                    else{
                        time += (arr[i][j] - h) * 2;
                        block +=  arr[i][j] - h ;
                    }
                }
            }
            if(time <result && block>=0){
                result = time;
                height = h;
            }
        }
        System.out.println(result + " " + height);

    }
}