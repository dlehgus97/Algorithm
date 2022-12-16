class Solution {
    public int[] solution(int n) {
      int [] arr = new int[10002];
        
        while(n !=1){
            for(int i = 2 ; i<=n; i++){
                if(n % i == 0){
                    n /= i;
                    arr[i]++; 
                    break;
                }
            } 
        }
        int result = 0;
        for(int i = 2; i<=10000; i++){
            if(arr[i]>0){
                result ++;
            }
        }
        int[] answer = new int[result];
        int num  = 0;
        for(int i = 2 ; i<=10000; i++){
            if(arr[i]>0){
                answer[num] = i;
                num++;
            }
        }
       
        
        return answer;
    }
}
