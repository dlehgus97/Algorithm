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

/*유클리드 호제법 
2개 수의 최대 공약수를 구하는 알고리즘이다. 

원리는 다음과 같다. 

자연수 a,b에 대해서 a를 b로 나눈 나머지를 r이라 한다면 a,b의 최대공약수와 b,r의 최대공약수는 같다. 

이 성질에 따라 a를 b로 나눈 나머지 r을 구하고, b를 r로 나눈 나머지 r'을 구한다.  

나머지가 0이 될때 나눈 수가 a,b의 최대공약수가 된다. 

 

유클리드 호제법으로 최대 공약수를 구한 다음, 최소 공배수는 다음 식에 의해 구할 수 있다. 

최소 공배수 : (a ✕  b) / (최대 공약수)
*/
