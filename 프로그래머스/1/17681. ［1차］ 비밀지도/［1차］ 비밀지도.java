class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String [n];
        
    
        String [] set1 = new String [n];
        String [] set2 = new String [n];
        
        
        for(int i = 0; i<n; i++){
            set1[i] = Integer.toBinaryString(arr1[i]);
            set2[i] = Integer.toBinaryString(arr2[i]);
            
            String tmp = "";
            if(set1[i].length() <n || set2[i].length() < n){
                for(int j = 0 ; j<n - set1[i].length();  j++){
                    tmp += "0";
                }
                
                set1[i] = tmp + set1[i];
                
                tmp = "";
                for(int j = 0 ; j<n - set2[i].length();  j++){
                    tmp += "0";
                }
                
                set2[i] = tmp + set2[i];  // 같은 자릿수로 만들었음 
               
            }
        }
        
        for(int i = 0 ; i<n; i++){
            answer[i] = ""; // String 배열은 초기화 값이 null이 된다 .
            for(int j = 0 ; j<set1[i].length(); j++){
                if(set1[i].charAt(j) ==('0') && set2[i].charAt(j) == ('0')){
                    answer[i] += ' ';
                }
                else {
                    answer[i] += '#';
                    }
                }   
            }
        return answer;
        }
        
        
    }