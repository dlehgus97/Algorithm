class Solution {
    static int answer ;
    public int solution(int[] nums) {
        answer = 0;

        for(int i = 0 ; i<nums.length - 2; i++){
            for(int j = i + 1; j<nums.length - 1; j++){
                for(int k = j + 1; k<nums.length ; k++){
                    int num = nums[i] + nums[j] + nums[k];
                    answer += prime(num);
                }
            }
        }
        return answer;
    }
    public static int prime(int a){
        boolean check  = true;
        
        for(int i = 2 ; i<a; i++){
            if(a % i == 0){
                check = false ;
                break;
            }
        }
        if(check){
            return 1;
        }
        else{
            return 0;
        }
    }
}