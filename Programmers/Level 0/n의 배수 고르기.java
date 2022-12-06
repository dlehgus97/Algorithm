class Solution {
    public int[] solution(int n, int[] numlist) {
        int total = 0 ;
        int arr[] = new int [numlist.length];
        for(int i = 0 ; i<numlist.length; i++){
            if(numlist[i] % n == 0){
                arr[total] = numlist[i];
                total ++;
            }
        }
        int [] answer = new int[total];
        for(int i = 0 ; i<total; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}
