import java.io.IOException;

public class Main {
    public static void main(String [] args) throws IOException{
        boolean [] check= new boolean[10001];

        for(int i = 1; i<10001; i++){
            int num = selfNum(i);

            if(num<10001){
                check[num] = true;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i<10001; i++){
            if(!check[i]){
                sb.append(i).append("\n");
            }
        }
    System.out.print(sb);
    }

    static int selfNum(int a){
        int sum = a;

        while( a != 0){
            sum += (a%10);
            a /= 10;
        }
        return sum;

    }
}

// StringBuilder 이랑 시간차이가 48정도 난다 
import java.io.IOException;

public class Main {
    public static void main(String [] args) throws IOException{
        boolean [] check= new boolean[10001];

        for(int i = 1; i<10001; i++){
            int num = selfNum(i);

            if(num<10001){
                check[num] = true;
            }
        }


        for(int i = 1; i<10001; i++){
            if(!check[i]){
                System.out.println(i);
            }
        }

    }

    static int selfNum(int a){
        int sum = a;

        while( a != 0){
            sum += (a%10);
            a /= 10;
        }
        return sum;

    }
}

// boolean 이 아닌 int 형태로 하니까 4정도 시간이 줄어들었다 이유가 뭘까 
import java.io.IOException;

public class Main {
    public static void main(String [] args) throws IOException{
        int [] check= new int [10001];

        for(int i = 1; i<10001; i++){
            int num = selfNum(i);

            if(num<10001){
                check[num]++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i<10001; i++){
            if(check[i] ==0){
               sb.append(i).append("\n");
            }
        }
        System.out.print(sb);

    }

    static int selfNum(int a){
        int sum = a;

        while( a != 0){
            sum += (a%10);
            a /= 10;
        }
        return sum;

    }
}
