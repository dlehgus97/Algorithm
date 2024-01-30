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

        char [][] arr = new char [N][M];

        for(int i = 0 ; i<N; i++){
            String str = br.readLine();
            for(int j = 0; j<M; j++){
                arr[i][j] = str.charAt(j);
            }
        }

        int result = Integer.MAX_VALUE;

        String [] board = {"BWBWBWBW" , "WBWBWBWB"};

        for(int i = 0 ; i<= N- 8; i++){
            for(int j = 0 ; j<=M-8; j++){
                int tmp = 0;
                for(int k = 0 ; k<8;  k++){
                    for(int l  = 0; l<8; l++){
                        if(arr[k+i][l+j] == board[k % 2].charAt(l)){  // white 기준일떄만 구한다음에 64에서 뺴준다음에 블랙을 수정할지 화이트를 수정할지 결정하는것이다
                            tmp++;
                        }
                    }
                }
                result = Math.min(result, Math.min(tmp, 64-tmp));
            }
        }
        System.out.println(result);
    }
}