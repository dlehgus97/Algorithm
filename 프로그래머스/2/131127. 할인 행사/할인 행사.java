class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        int [] arr = new int [want.length];
        
        for(int i = 0 ; i<discount.length - 9 ; i++){
            arr = new int [want.length];
            for(int j = i ; j<i+10; j++){
                for(int k = 0 ; k<want.length; k++){
                    if(want[k].equals(discount[j])){
                        arr[k]++;
                        break;
                    }
                }
            }
            boolean check = true;
            
            for(int j = 0 ; j<want.length; j++){
                if(arr[j] != number[j]){
                    check = false;
                    break;
                }   
            }
            if(check){
                answer++;
                System.out.println(i);
            }
        }
        
        
        return answer;
    }
}