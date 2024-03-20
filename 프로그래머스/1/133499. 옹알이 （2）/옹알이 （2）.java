class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String [] can = {"aya", "ye", "woo", "ma"};
        String [] cant= {"ayaaya","yeye","woowoo","mama"};
        int num = 0;
        
        for(int i = 0 ; i<babbling.length; i++){
            for(int j = 0 ; j<cant.length; j++){
                if(babbling[i].contains(cant[j])){
                    System.out.println(babbling[i]);
                    babbling[i] += "x";
                    break;
                }
            }
            for(int j = 0 ; j<can.length; j++){
                if(babbling[i].contains(can[j])){
                    babbling[i] = babbling[i].replace(can[j], "-");
                }
            }
            boolean check = true;
            
            for(int j = 0 ; j<babbling[i].length(); j++){
                if(babbling[i].charAt(j) != '-'){
                    check = false;
                    break;
                }
            }
            
            if(check){
                answer++;
            }
        }
        
        return answer;
    }
}