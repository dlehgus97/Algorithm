class Solution {
    public int solution(String before, String after) {
        int answer = 1 ;
        int [] arr1 = new int [26];
        int [] arr2 = new int [26];
        for(int i = 0 ; i<before.length(); i++){
            arr1[before.charAt(i) - 'a']++;
        }
        for(int i = 0 ; i<after.length(); i++){
            arr2[after.charAt(i) - 'a']++;
        }
        for(int i = 0 ; i<26; i++){
            if(arr1[i] != arr2[i]){
                answer = 0;
                break;
            }    
        }
        return answer;
    }
}
