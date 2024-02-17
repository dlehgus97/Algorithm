import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        HashSet<String>set = new HashSet<>();

        for(int i = 0 ; i<str.length(); i++){
            for(int j = i+1 ; j<=str.length(); j++){
                set.add(str.substring(i,j));
                /*순서대로 a,ab,aba,abab,ababc,b,ba,bab,babc,a,ab,abc,b,bc,c  15개중 중복제거 
                subString 기능 잘 알 것 
            */}
        }
        System.out.println(set.size());
     }
}