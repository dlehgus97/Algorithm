class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = "" +order;
        for(int i = 0 ; i<str.length(); i++){
            if(str.charAt(i) == '3' || str.charAt(i) == '6' || str.charAt(i) == '9')
                answer ++;
        }
        return answer;
    }
}

//처음에는 아래 처음 풀었지만 시간초과가 발생하였고 
class Solution {
    public int solution(int order) {
        int answer = 0;
        while(true){
            if(order % 10 == 3 ||order %10 == 6||order %10 == 9){
                answer ++;
                order /= 10;
            }
            if(order == 0)
                break;
        }

        return answer;
    }
}

// 시간초과 해결 방법을 찾았다 .. 아주 단순하게 ..
class Solution {
    public int solution(int order) {
        int answer = 0;
        while(order!=0){
            if(order % 10 == 3 ||order %10 == 6||order %10 == 9){
                answer++;
                
            }
            order /= 10;
        }
        return answer;
    }
}
