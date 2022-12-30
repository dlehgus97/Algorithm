import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String [] arr = new String[N];

        for(int i = 0 ; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = st.nextToken();
        }
        String [] answer = arr[0].split("");

        for(int i = 1 ; i<N; i++){
            for(int j = 0 ; j<arr[i].length(); j++){
                if(!answer[j].equals(String.valueOf(arr[i].charAt(j)))){
                    answer[j] ="?";
                }
            }
        }
        for(int i = 0 ; i< answer.length; i++){
            System.out.print(answer[i]);
        }
     }
  }
