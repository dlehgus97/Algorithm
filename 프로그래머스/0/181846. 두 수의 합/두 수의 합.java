import java.io.*;
import java.util.*;
import java.math.*;

class Solution {
    public String solution(String a, String b) {        
        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);
        
        BigInteger sum = num1.add(num2);
        
        String answer = sum.toString(); // 기본 정수형과 다르게 객체이므로 BigIntger.toString 불가능
        
        
        return answer;
    }
}