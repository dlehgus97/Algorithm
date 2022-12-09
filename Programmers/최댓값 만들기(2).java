class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = -1000000001 ;  // 초깅 0으로 설정 했을때 실패 최소값인 -10000 *10000 값보다 작은수를 넣어줘야함
        for (int i = 0; i < numbers.length-1 ; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if(max < numbers[i] * numbers[j])
                    max = numbers[i] * numbers[j];

                }
            }
        answer = max;
        return answer;
    }
}
