import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] room = new String[N][N];

        // 방 배열 초기화
        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            for (int j = 0; j < N; j++) {
                room[i][j] = String.valueOf(word.charAt(j));
            }
        }

        int horizontalCount = 0;
        int verticalCount = 0;

        // 가로로 누울 수 있는 자리 개수 세기
        for (int i = 0; i < N; i++) {
            String row = String.join("", room[i]);
            String[] horizontalSeats = row.split("X");
            for (String seats : horizontalSeats) {
                if (seats.length() >= 2) {
                    horizontalCount++;
                }
            }
        }

        // 세로로 누울 수 있는 자리 개수 세기
        for (int j = 0; j < N; j++) {
            StringBuilder col = new StringBuilder();
            for (int i = 0; i < N; i++) {
                col.append(room[i][j]);
            }
            String[] verticalSeats = col.toString().split("X");
            for (String seats : verticalSeats) {
                if (seats.length() >= 2) {
                    verticalCount++;
                }
            }
        }

        System.out.println(horizontalCount + " " + verticalCount);
    }
}
