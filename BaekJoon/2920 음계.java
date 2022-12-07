import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] arr =new int[8];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int asc = 0;
        int des = 0;
        for(int i = 0 ; i<8; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0 ; i<8; i++){
            if(arr[i] == i+1) {
                asc++;
        }
            else if(arr[i] == 8-i){
                des++;
            }
            else {
                break;
            }
        }
        if(asc == 8)
        System.out.print("ascending");
        else if(des == 8)
            System.out.print("descending");
        else
            System.out.println("mixed"); }

    }

//처음 작성한 코드
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] arr =new int[8];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        String word=" ";

        for(int i = 0 ; i<8; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0 ; i<8; i++){
            if(arr[i] == i+1) {
                word = "ascending";
            }
            else if(arr[i] == 8-i){
                word = "descending";;
            }
            else {
                word = "mixed";
                break;
            }
        }
        System.out.print(word);
    }
}

//처음 작성한 코드는 틀린 이유를 몰랐었다. 게속 생각해보니 이 코드는 1 2 3 4 4 3 2 1 를 입력하면 mixed 가아닌 descending이 출력된다. mixed 에 가지 않고 아래 조건문으로
//간다는 말 후 .. 조심하자 ..
