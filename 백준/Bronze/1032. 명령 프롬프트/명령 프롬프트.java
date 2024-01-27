import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];

        for(int i = 0 ; i<N; i++){
            arr[i] = br.readLine();
        }

       char [] result = new char[arr[0].length()];

        for(int i = 0 ; i<result.length; i++){
            result[i] = arr[0].charAt(i);
        }

        for(int i = 0 ; i<N-1; i++){
            for(int j = i + 1 ; j<N; j++){
                for(int k = 0 ; k<result.length; k++){
                    if(arr[i].charAt(k) != arr[j].charAt(k)){
                        result[k] = '?';
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char num : result){
            sb.append(num);
        }
        System.out.println(sb);
    }
}