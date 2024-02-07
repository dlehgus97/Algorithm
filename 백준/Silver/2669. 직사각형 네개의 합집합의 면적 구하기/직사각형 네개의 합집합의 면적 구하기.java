import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public  class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;

        int [] x1 = new int[4];
        int [] y1 = new int[4];
        int [] x2 = new int[4];
        int [] y2 = new int[4];


        for(int i = 0 ; i<4; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            x1[i] = Integer.parseInt(st.nextToken());
            y1[i] = Integer.parseInt(st.nextToken());
            x2[i] = Integer.parseInt(st.nextToken());
            y2[i] = Integer.parseInt(st.nextToken());

            maxX = Math.max(maxX,Math.max(x1[i],x2[i]));
            maxY = Math.max(maxY,Math.max(y1[i],y2[i]));
        }

        boolean [][] arr = new boolean[maxY + 1][maxX + 1];

        int result = 0;

        for(int i = 0 ; i<4; i++){
            for(int j = y1[i]; j<y2[i]; j++){
                for(int k = x1[i]; k<x2[i]; k++){
                        arr[j][k] = true;
                }
            }
        }

        for(int i = 0 ; i<=maxY; i++){
            for(int j = 0 ; j<=maxX; j++){
                if(arr[i][j]){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}