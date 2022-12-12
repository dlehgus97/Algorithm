import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
public static void  main(String []args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int [][] arr = new int[N][2];

    for(int i = 0 ; i<N; i++){
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr[i][0] = Integer.parseInt(st.nextToken());
        arr[i][1] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(arr, (o1, o2) -> {
        if(o1[0] == o2[0]) {
            return Integer.compare(o1[1], o2[1]);
        }
        else{
                return Integer.compare(o1[0],o2[0]);
            }
        });
    
        StringBuilder sb = new StringBuilder();

    for(int i = 0 ;i < N; i++){
        sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
    System.out.println(sb);
    }
}


//처음에 StringBuilder를 사용안하고 그냥 출력했을때 시간이 너무 길어졌다. StringBuilder로 시간을 줄인다.  1640ms에서 704ms로 줄어든다 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
public static void  main(String []args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int [][] arr = new int[N][2];

    for(int i = 0 ; i<N; i++){
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr[i][0] = Integer.parseInt(st.nextToken());
        arr[i][1] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(arr, (o1, o2) -> {
        if(o1[0] == o2[0]) {
            return Integer.compare(o1[1], o2[1]);
        }
        else{
                return Integer.compare(o1[0],o2[0]);
            }
        });

    for(int i = 0 ;i < N; i++){
        System.out.println(arr[i][0] +" "+ arr[i][1]);

    }
    }
}
