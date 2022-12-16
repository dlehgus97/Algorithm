class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int result = 0;
        while(chicken  != 0){
            answer += chicken / 10;
            result += (chicken % 10);
            chicken  /= 10;      
        }
        
        while(true){
            answer += result / 10;
             result =  (result/10) + (result%10);
            if(result<10){
                break;
            }
        }
        
        return answer;
    }
}

//이 방법은 생각도 못했넹 .. 어차피 다 쿠폰인걸 ..

class Solution {
    public int solution(int chicken) {
        int answer = 0;
        while (chicken >= 10){
            int service = chicken / 10;
            int nmg = chicken %  10;

            chicken = service + nmg;

            answer += service;

        }


        return answer;
    }
}
