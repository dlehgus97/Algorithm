class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        String tmp = "";
        int[] arr_X = new int[10];
        int[] arr_Y = new int[10];

        StringBuilder sb = new StringBuilder();

        int zeroCount = 0;


        for (int i = 0; i < X.length(); i++) {
            arr_X[X.charAt(i) - '0']++;
        }

        for (int i = 0; i < Y.length(); i++) {
            arr_Y[Y.charAt(i) - '0']++;
        }


        for (int i = 0; i < 10; i++) {
            int min = Math.min(arr_Y[i], arr_X[i]);
            for (int j = 0; j < min; j++) {
                sb.append(i);
            }
        }

        if (sb.length() == 0) {
            return "-1";
        } else {
            answer = sb.reverse().toString();
            if (answer.charAt(0) == '0') {
                return "0";
            }
            return answer;
        }
    }
}