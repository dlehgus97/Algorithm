class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int [arr.length];
        
        for(int i = 0 ; i<arr.length; i++){
            int count = 1;
            for(int j = 0; j<arr.length; j++){
                if(arr[i]<arr[j])
                    count ++;
            }
            answer[i] = count;
        }
        return answer;
    }
}
