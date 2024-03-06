class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int total = brown + yellow;
        
        for (int i = 1; i <= total / 2; i++) {
            if (total % i == 0) {
                int width = i;
                int height = total / i;
                if ((width - 2) * (height - 2) == yellow) {
                    answer[0] = height;
                    answer[1] = width;
                    break;
                }
            }
        }
        
        return answer;
    }
}
