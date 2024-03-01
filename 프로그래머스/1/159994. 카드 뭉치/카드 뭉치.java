class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        
        int [] arr1 = new int [cards1.length];
        int [] arr2 = new int [cards2.length];
        
        for(int i = 0 ; i<arr1.length ; i++){
                arr1[i] = 21;
        }
        for(int i = 0 ; i<arr2.length ; i++){
                arr2[i] = 21;

        }
        
        for(int i = 0 ; i<goal.length; i++){
            for(int j = 0 ; j<cards1.length; j++){
                if(goal[i].equals(cards1[j])){
                    arr1[j] = i;
                }
            }
            for(int j = 0 ; j<cards2.length; j++){
                if(goal[i].equals(cards2[j])){
                    arr2[j] = i;
                }
            }
        }
        
        boolean check = true;
        
        for(int i = 0; i<cards1.length - 1; i++){
            for(int j =i+1; j<cards1.length; j++){
                if(arr1[i]>arr1[j]){
                    check = false;
                    break;
                }
            }
        }
        if(check){
            for(int i = 0; i<cards2.length - 1; i++){
            for(int j =i+1; j<cards2.length; j++){
                if(arr2[i]>arr2[j]){
                    check = false;
                    break;
                    }
                }
            }
        }
        if(check){
            answer = "Yes";
        }
        else{
            answer = "No";
            }
        return answer;
    }
}