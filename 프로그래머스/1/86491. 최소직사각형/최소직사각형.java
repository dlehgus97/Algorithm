class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        for(int i = 0 ; i<sizes.length; i++){
            int tmp = 0;
            if(sizes[i][0]>sizes[i][1]){
                tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i = 0 ; i<sizes.length; i++){
            if(sizes[i][0] > max1){
                max1 = sizes[i][0];
            }
            if(sizes[i][1] > max2){
                max2 = sizes[i][1];
            }
        }
        
        answer = max1 * max2 ;
        
        return answer;
    }
}