import java.math.BigInteger;

class Solution {
    public BigInteger solution(int balls, int share) {
        BigInteger num1 = BigInteger.ONE;
        BigInteger num2 = BigInteger.ONE;
        
        for (long i = balls; i > balls - share; i--) {
            num1 = num1.multiply(BigInteger.valueOf(i));
        }
        for (long i = 1; i <= share; i++) {
            num2 = num2.multiply(BigInteger.valueOf(i));
        }
        
        return num1.divide(num2);
    }
}
