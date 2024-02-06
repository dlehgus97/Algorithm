import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        String [][] arr = new String[N][N];

        for(int i = 0 ; i<N; i++){
            String str = br.readLine();
            for(int j = 0 ; j<N; j++){
                arr[i][j] = String.valueOf(str.charAt(j));
            }
        }
        int count = 0 ;
        int result = 0;
        for(int i = 0 ; i<N; i++){
            for(int j = 0 ; j<N; j++){
                if(arr[i][j].equals(".")){
                    count++;
                    if(j == N - 1){
                        if(count>=2){
                            result++;
                        }
                        count = 0;
                    }
                }
                else if(arr[i][j].equals("X")){
                    if(count>=2){
                        result++;
                    }
                    count = 0;
                }
            }
        }

        sb.append(result + " ");

        count = 0 ;
        result = 0;


        for(int i = 0 ; i<N; i++){
            for(int j = 0 ; j<N; j++){
                if(arr[j][i].equals(".")){
                    count++;
                    if(j == N - 1){
                        if(count>=2){
                            result++;
                        }
                        count = 0;
                    }
                }
                else if(arr[j][i].equals("X")){
                    if(count>=2){
                        result++;
                    }
                    count = 0;
                }
            }
        }
        sb.append(result);
        System.out.println(sb);
    }
}