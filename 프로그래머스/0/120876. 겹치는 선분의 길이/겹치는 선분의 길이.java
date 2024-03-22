class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        int [] arr = new int [201];
        
        for(int i = 0 ; i<lines.length; i++){
                
            for(int j = lines[i][0] + 1  ; j<=lines[i][1]; j++){
                arr[j + 100] += 1;
            }
        }
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i] > 1){
                answer++;
            }
        }
        
        return answer ;
    }
}