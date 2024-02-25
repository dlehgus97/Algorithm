class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int [score.length];
        int [] arr = new int [answer.length];
        for(int i = 0 ; i<score.length; i++){
            arr[i] = score[i][0] + score[i][1] ;
            answer[i] = 1;
        }
        
        for(int i = 0 ; i<arr.length; i++){
            for(int j = 0 ; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}