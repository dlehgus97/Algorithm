class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        int [] arr = new int [201];
        
        for(int i = 0 ; i<lines.length; i++){
            for(int j = lines[i][0]; j<lines[i][1]; j++){ 
                arr[j + 100] += 1;
            }
        }
        
        //0 ~ 2 선분이라면 0 ~ 1 선분을 arr[101]++; 해서 좌표로 보는게 아니라 선분으로 봤다.
        //그래서 선분이 2개 이상이라면 겹치는걸로 처리했다 .
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i] > 1){
                answer++;
            }
        }
        
        return answer ;
    }
}