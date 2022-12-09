class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        int n = num1*num2;
        int de = (denum1*num2) + (denum2*num1);
        int max = 0;
        for(int i = 1 ; i<=n && i<=de; i++){
            if(n%i == 0 && de % i == 0)
                max = i;
        }
        answer[0] = de/max;
        answer[1] = n/max;
        return answer;
    }
}

//최대공약수 최소공약수 구해서 해되 된다
// int i = 0 으로 하면 ArithmeticException 오류가 발생하는데 이는  10/0 처럼 0으로 나누게 되면 발생하는 오류 
