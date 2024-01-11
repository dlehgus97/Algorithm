import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String [] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        for(int i = 0 ; i<arr.length; i++){
            if(str.contains(arr[i])){
                str = str.replace(arr[i]," ");
            }

        }
        System.out.println(str.length());
    }
}

