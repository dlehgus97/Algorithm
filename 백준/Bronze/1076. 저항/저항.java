import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] color = {"black", "brown", "red", "orange", "yellow", "green",
                "blue", "violet", "grey", "white"};
        int [] result = {0,1,2,3,4,5,6,7,8,9};
        int [] num = {1,10,100,1000,10000,100000,1000000,10000000,100000000,1000000000};
        String [] arr = new String[3];

        for(int i = 0 ; i<3; i++){
            arr[i] = br.readLine();
        }
        int [] sum = new int[3];

        for(int i = 0 ; i<3; i++){
            for(int j = 0; j< color.length; j++){
                if(arr[i].equals(color[j])){
                    sum[i] = j;
                }
            }
        }

        long total = (long)(result[sum[0]] * 10 + result[sum[1]]) * (long)num[sum[2]];
        System.out.println(total);
    }
}