class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int gcd_num = arr[0] * arr[1] / gcd(arr[0],arr[1]) ;
        
        for(int i = 2; i<arr.length; i++){
            gcd_num = gcd_num * arr[i] / gcd(gcd_num,arr[i]);
        }
        
        answer = gcd_num;
        
        return answer;
    }
    
    public static int gcd(int a , int b){
        if(b == 0){
            return a;
        }
        else return gcd(b,a%b);
    }
}