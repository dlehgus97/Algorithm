class Solution {
    public String solution(int age) {
        String answer = "";
        String num = Integer.toString(age);
        
        for(int i = 0 ; i<num.length(); i++){
            answer += (char)(num.charAt(i) +(97-48));   //a 아스키코드 97 , 0 아스키코드 48   ==> a가 되기 위해서는 두 아스키 코드의 차이만큼 더해줘야한다. 
        }
        return answer;
    }
}

//방법 2
class Solution {
    public String solution(int age) {
        String answer = "";
        String num = Integer.toString(age);
        String [] arr = num.split("");
        for(int i = 0 ; i<num.length(); i++){
            answer += ((char)(Integer.parseInt(arr[i]) +97));
        }
        return answer;
    }
}
