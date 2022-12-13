class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int [score.length];
        int arr[] = new int [score.length];
        for(int i = 0 ;i<score.length; i++){
            arr[i] = score[i][0] + score[i][1];
        }
        for(int i = 0 ; i<score.length; i++){
            int rank = 1;
            for(int j = 0 ; j<score.length; j++){
                if(arr[i]<arr[j]){
                    rank++;
                }
            }
            answer[i] = rank;
        }
        return answer;
    }
}
