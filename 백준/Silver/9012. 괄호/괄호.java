import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for(int i = 0 ; i<N; i++){
            String word = br.readLine();
            Stack<Character>stack = new Stack<>();

            for(int j = 0 ; j <word.length(); j++) {
                if (word.charAt(j) == '(') {
                    stack.push(word.charAt(j));
                } else {
                    if (stack.isEmpty()) {
                        stack.push(word.charAt(j));
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if(stack.isEmpty()){
                sb.append("YES").append("\n");
            }
            else{
                sb.append("NO").append("\n");
            }
        }
        System.out.println(sb);
    }
}