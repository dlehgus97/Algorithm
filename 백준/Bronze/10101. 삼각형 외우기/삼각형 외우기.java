import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        if((A == B && B == C && C == 60)){
            System.out.println("Equilateral");
        }
        if (A+B+C == 180){
            if(A == B && B != C){
                System.out.println("Isosceles");
            }
            else if(B == C && A != C){
                System.out.println("Isosceles");
            }
            else if(C == A && A != B){
                System.out.println("Isosceles");
            }
            else if(A != B && B != C && C != A){
                System.out.println("Scalene");
            }
            
        }
        else{
            System.out.println("Error");
        }

    }
}
