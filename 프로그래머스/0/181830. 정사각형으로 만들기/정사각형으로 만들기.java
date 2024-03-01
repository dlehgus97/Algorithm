class Solution {
    public int[][] solution(int[][] arr) {
        int max = arr.length;
        
        for(int i = 0; i<arr.length; i++){
                if(max<arr[i].length){
                    max = arr[i].length;                }
        }
        
        
        int[][] answer = new int [max][max];
        
        for(int i = 0 ; i<arr.length; i++){
            for(int j = 0 ; j<arr[i].length; j++){
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}