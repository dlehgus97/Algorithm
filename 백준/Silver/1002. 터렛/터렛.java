import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            System.out.println(turret(x1,y1,r1,x2,y2,r2));
        }

    }
    public static int turret(int x1, int y1, int r1, int x2, int y2, int r2 ){
        int dis_pow = (int)(Math.pow((x2-x1),2) + Math.pow(((y2-y1)),2));

        if(x1 == x2 && y1 == y2 && r1 == r2){  // 원의 반지름과 좌표가 다 동일할때 
            return -1;
        }
        else if(dis_pow > Math.pow(r2 + r1,2)){ //두 좌표 사이거리가 각 원의 반지름 합보다 클때 
            return 0;
        }
        else if(dis_pow < Math.pow(r2 - r1,2)){ // 작은 원이 큰 원안에 들어가있는데 안접할때 
            return 0; // 여기는 큰원의 반지름에서 작은원의 반지름 뺀것이 좌표사이의 거리보다 크다는 의미 
        // 최소 1개라도 나오려면  dis_pow + r1 = r2  가 되어야하는데  이 조건은 만족시키지 못한상황
        }
        else if(dis_pow == Math.pow(r2 - r1,2)){ // 위에서말한 최소 1개가 나오는상황 
            return 1;
        }
        else if(dis_pow == Math.pow(r2 + r1,2)){ // 두 원이 외접할때 
            return 1;
        }
        else {
            return 2;
        }
    }
}