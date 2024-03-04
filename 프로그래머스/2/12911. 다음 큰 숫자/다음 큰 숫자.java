class Solution {
    public int solution(int n) {
        int count = 0 ;
        
        String num = Integer.toString(n,2);
        
        for(int i = 0 ; i<num.length(); i++){
            if(num.charAt(i) == '1'){
                count++;
            }
        }
        n++;
        
        int tmp = 0;
        String result = "";
        
        while(true){
            tmp = 0;
            result = Integer.toString(n,2);
            for(int i = 0 ; i<result.length(); i++){
                if(result.charAt(i) == '1'){
                    tmp++;
                }
            }
            if(tmp == count){
                    break;
                }
            n++;
        }
        
        return Integer.parseInt(result,2);
    }
}