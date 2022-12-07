class Solution {
    public int[] solution(int n) {
         int sum = 0;
        int [] arr = new int [n];
        for(int i = 1 ; i<=n; i++){
            if(n%i ==0){
                arr[sum] = i;
                sum++;
            }
        }
        int[] answer = new int[sum];
        for(int i = 0 ; i<sum; i++){
                answer[i] = arr[i];
        }
        return answer;
    }
}
