import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();

        while (true) {
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();

            if (str.equals(".")) {
                break;
            }

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(' || str.charAt(i) == '[') {
                    stack.push(str.charAt(i));

                } else if (str.charAt(i) == ')') {
                    if (stack.isEmpty()) {
                        stack.push(str.charAt(i));
                        break;
                    } else {
                        if (stack.peek() == '(') {
                            stack.pop();
                        }
                        else {
                            break;
                        }
                    }
                } else if (str.charAt(i) == ']') {
                    if (stack.isEmpty()) {
                        stack.push(str.charAt(i));
                        break;
                    } else {
                        if (stack.peek() == '[') {
                            stack.pop();
                        }
                        else{
                            break;
                        }
                    }
                }
            }

            if (stack.isEmpty()) {
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }
        }
        System.out.println(sb);
    }
}