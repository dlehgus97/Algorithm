import java.util.*;
import java.io.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;

       while(n>0){
           if(n % 2 != 0){
               ans++;
               n --;
               n /= 2;
           }
           else{
               n /= 2;
           }
       }

        return ans;
    }
}