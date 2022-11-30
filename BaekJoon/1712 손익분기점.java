import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String []args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        if(B>=C)
            System.out.println(-1);
        else
            System.out.println(A/(C-B)+1); //+1 본전에서 이익으로 바뀌어야해서

    }
}

//시간복잡도를 고려하지 않아 시간초과난 코드 

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String []args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        long C = Integer.parseInt(st.nextToken());
        int x =0;
        if(B>C)
            System.out.println(-1);
        while(true){
            if(A+(B*x)<=(C*x)){
                break;
            }
            x++;
        }
        System.out.println(x+1);
    }
}*/
