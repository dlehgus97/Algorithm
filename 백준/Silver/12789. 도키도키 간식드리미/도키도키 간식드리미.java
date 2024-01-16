import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer>stack1 = new Stack<>();
        Stack<Integer>stack2 = new Stack<>();


        int [] arr = new int[N];

        for(int i = 0 ; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int num = 1;
        int i = 0 ;

        while(i<N){
            if(arr[i] != num){
                stack2.push(arr[i]);
            }
            else{
                stack1.push(arr[i]);
                num++;
            }
            if (!stack2.isEmpty()) {
                while (true) {
                    if (!stack2.isEmpty() && num == stack2.peek()) {
                        stack1.push(stack2.pop());
                        num++;
                    } else {
                        break;
                    }
                }
            }
            i++;
        }
        for(int j = 0 ; j<stack2.size(); j++){
            stack1.push(stack2.pop());
        }

        String result = "Nice";

        for(int j = 1 ; j<=stack1.size(); j++){
            if(j != stack1.get(j-1)){
                result = "Sad";
            }
        }
        System.out.println(result);
    }
}