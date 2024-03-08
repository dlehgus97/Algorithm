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

        String [] arr = new String[N];

        for(int i = 0; i<N; i++){
            arr[i] = br.readLine();
        }
        String result = "";
        int ans = 0;

        for(int i = 0 ; i<M; i++){
            int [] check = new int[26];
            int max = -1;
             for(int j = 0 ; j<N; j++){
                 check[arr[j].charAt(i) - 'A']++;
                 if(check[arr[j].charAt(i) - 'A']>max){
                     max = check[arr[j].charAt(i) - 'A'];
                 }
            }
             for(int j = 0 ; j<26; j++){
                 if(check[j] == max){
                     result += (char)(j+'A');
                     ans += N - max;
                     break;
                 }
             }
        }
        System.out.println(result);
        System.out.println(ans);
    }
}