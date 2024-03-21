import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st ;
        String [][] name = new String[N][4];

        for(int i = 0 ; i<N; i++){
            st = new StringTokenizer(br.readLine());
            name[i][0] = st.nextToken();
            name[i][1] = st.nextToken();
            name[i][2] = st.nextToken();
            name[i][3] = st.nextToken();
        }

        Arrays.sort(name, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if(Integer.parseInt(o1[3]) == Integer.parseInt(o2[3])){
                    if(Integer.parseInt(o1[2]) == Integer.parseInt(o2[2])){
                        return Integer.parseInt(o1[1]) - Integer.parseInt(o2[1]);
                    }
                    return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
                }
                return Integer.parseInt(o1[3]) - Integer.parseInt(o2[3]);
            }
        });
        
        System.out.println(name[N - 1][0]);
        System.out.println(name[0][0]);

    }
}