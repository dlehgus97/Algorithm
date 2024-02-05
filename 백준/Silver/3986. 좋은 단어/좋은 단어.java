import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i = 0 ; i<N; i++){
            String word = br.readLine();
            Stack<Character>stack = new Stack<>();
            for(int j = 0 ; j<word.length(); j++) {
                if (stack.isEmpty()) {
                    stack.push(word.charAt(j));
                }
                else {
                    if (stack.peek() == 'A' && word.charAt(j) == 'A') {
                        stack.pop();
                    }
                    else if (stack.peek() == 'B' && word.charAt(j) == 'B') {
                        stack.pop();

                    }
                    else if (stack.peek() == 'A' && word.charAt(j) == 'B') {
                        stack.push('B');

                    }
                    else if (stack.peek() == 'B' && word.charAt(j) == 'A') {
                        stack.push('A');
                    }
                }
            }
            if(stack.isEmpty()){
                result++;
            }
        }
        System.out.println(result);
    }
}