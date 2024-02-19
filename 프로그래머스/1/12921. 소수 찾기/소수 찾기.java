class Solution {
    static int count = 0;
    
    public int solution(int n) {
        int answer = 0;
        
        answer = prime(n);
        
        return answer;
    }
    public static int prime(int a){
        if(a == 2){
            return 1;
        }
        for(int i = 2; i<=a; i++){
            boolean check = false; 
            for(int j = 1; j*j<=i; j++){
                if(i% j == 0 && j != 1){
                    check = true;
                    break;
                    }
                }
            if(!check){
                count++;
                }
            }
        return count;
        }
        
    }