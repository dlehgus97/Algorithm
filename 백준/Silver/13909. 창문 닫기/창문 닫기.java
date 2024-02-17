import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args)  throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = 0 ;

        for(int i = 1; i*i<=N ; i++){
            result++;
        }
        System.out.println(result);
    }
}


/* 메모리 초과난 코드




import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        int [] arr = new int[N+1];

        for(int i = 0 ; i<arr.length; i++){
            arr[i] = 0;
        }

        for(int i = 1; i<N+1; i++){
            for(int j = i; j<=N; j++){
                if(j % i == 0 && arr[j] == 1){
                    arr[j] = 0;
                }
                else if(j % i == 0 && arr[j] == 0){
                    arr[j] = 1;
                }
            }
        }

        int result = 0 ;

        for(int i = 0 ; i<=N; i++){
            if(arr[i] == 1){
                result++;
            }
        }
        System.out.println(result);

    }
}*/