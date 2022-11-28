import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean [] arr= new boolean[10];
        int [] result = new int[10];
        int total = 0;
        for(int i =0 ;i<arr.length; i++){
           int num = Integer.parseInt(br.readLine()) % 42 ;
           result[i] = num;
           arr[i] = true;
        }
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(result[i] == result[j])
                    arr[i] = false;
            }
            if(arr[i] == true)
                total ++;

            }
       System.out.println(total);
        }
    }

// set을 이용한 방법 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<10; i++){
            set.add(Integer.parseInt(br.readLine())%42);
        }
        System.out.println(set.size());
        }
    }

//중복한 숫자가 제거 되지않고 하나로 생각하기에 가능한 방법

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] arr =new int[10];
        int [] result = new int[42];
        int total = 0;

        for(int i = 0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine()) % 42;
        }
        for(int i = 0 ; i<10; i++){
            result[arr[i]] = 1;  //중복 제거가 아니기 때문에 다 1로 두면 가능 결론적으로 2개 여도 1 이기 떄문에 가능 
        }
        for(int i = 0 ;i<42; i++){
            if(result[i] == 1)
                total ++;

        }
System.out.println(total);
    }
}
