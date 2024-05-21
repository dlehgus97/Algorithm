import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String king = st.nextToken();
        String stone = st.nextToken();
        int N = Integer.parseInt(st.nextToken());

        int[][] dxy = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}, {-1, 1}, {-1, -1}, {1, 1}, {1, -1}};
        String[] turn = {"R", "L", "B", "T", "RT", "LT", "RB", "LB"};

        int[] kingArr = {8 - (king.charAt(1) - '0'), king.charAt(0) - 'A'};
        int[] stoneArr = {8 - (stone.charAt(1) - '0'), stone.charAt(0) - 'A'};

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < turn.length; j++) {
                if (str.equals(turn[j])) {
                    int newKingRow = kingArr[0] + dxy[j][0];
                    int newKingCol = kingArr[1] + dxy[j][1];

                    if (newKingRow >= 0 && newKingRow < 8 && newKingCol >= 0 && newKingCol < 8) {
                        if (newKingRow == stoneArr[0] && newKingCol == stoneArr[1]) {
                            int newStoneRow = stoneArr[0] + dxy[j][0];
                            int newStoneCol = stoneArr[1] + dxy[j][1];

                            if (newStoneRow >= 0 && newStoneRow < 8 && newStoneCol >= 0 && newStoneCol < 8) {
                                stoneArr[0] = newStoneRow;
                                stoneArr[1] = newStoneCol;
                                kingArr[0] = newKingRow;
                                kingArr[1] = newKingCol;
                            }
                        } else {
                            kingArr[0] = newKingRow;
                            kingArr[1] = newKingCol;
                        }
                    }
                    break;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append((char) ('A' + kingArr[1])).append(8 - kingArr[0]).append("\n");
        sb.append((char) ('A' + stoneArr[1])).append(8 - stoneArr[0]);

        System.out.println(sb);
    }
}
