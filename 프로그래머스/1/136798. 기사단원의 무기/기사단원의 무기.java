class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int [] arr = new int [number + 1];
        
        for(int i = 1 ; i<=number; i++){
            arr[i] = num(i);
        }
        
        for(int i = 1; i<=number; i++){
            if(arr[i]>limit){
                answer += power;
            }
            else{
                answer += arr[i];
            }
        }
        
        return answer;
    }
    public static int num(int a){
        
        int result = 0;
        int tmp = 0;
        
        for(int i = 1 ; i*i<=a; i++){
                if(a % i == 0){
                    result ++;
                    tmp = i;
                }        
            }
        
        if(tmp*tmp == a){
            return (result * 2) - 1;
            }
        else{
            return result * 2;
            }   
    
        }
}