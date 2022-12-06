import java.util.*;
import java.io.*;
class Solution {
    public int[] solution(String str) {
        int[] arr = new int[str.length()];
        for(int i = 0 ; i<str.length(); i++){
            arr[i] = str.charAt(i);
        }
        Arrays.sort(arr);
        int sum = 0;
        int [] num = new int [arr.length];
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i] -'a'< 0){
                num[sum] = arr[i]-'0';
                sum++;
            }  
        }
        int[] answer = new int[sum];
        
        for(int i = 0; i<sum; i++){
            answer[i] = num[i];
        }
        return answer;
    }
}

//풀고나니 String my_string 을 relplaceAll을 사용하여 풀면 될꺼같아서 다시 풀었다 .
import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-z]","");
        int[] answer = new int [my_string.length()];
        for(int i = 0 ; i<answer.length; i++){
            answer[i] = my_string.charAt(i)-'0';
        }
        Arrays.sort(answer);
        
        return answer;
    }
}
