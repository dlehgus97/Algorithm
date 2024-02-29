class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        boolean [] check = new boolean [100001];
        int count = 0;
        
        for(int i = 0 ; i<arr.length; i++){
            if(check[arr[i]] == false){
                answer[count] = arr[i];
                count++;
                check[arr[i]] = true;
            }
            if(k== count){
                break;
            }
        }
        
        if(k>count){
            for(int i = count; i<answer.length; i++){
                answer[i] = -1;
            }
        }
        return answer;
    }
}