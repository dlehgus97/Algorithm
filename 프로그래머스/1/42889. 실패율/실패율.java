import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double [] arr = new double[N]; // 실패율 담을 배열 
        int [] num = new int[N];
        double [] copy = new double[N];
        
        
        
        int len = stages.length; // 줄어들어야 하기때문에 반복문 위에 설정
        
        for(int i = 0 ; i<N; i++){
            int count = 0; // 실패한 사람수 
            for(int j = 0 ; j<stages.length; j++){
                if(i + 1 == stages[j]){ //스테이지는 1부터 시작하기 때문에
                    count++;
                }
            }
            arr[i] = (double)count / (double)len ;
            
            if(len == 0){
                arr[i] = 0.0; // 실패한 사람이 없을 경우의수 
            }
            copy[i] = arr[i];  // 순서가 중요한데 밑에서 arr로 sort해서 실패율 높을걸 따져야기때문에 arr 값을 복사해준다 
            //조건이 //만약 실패율이 같은 스테이지가 있다면 작은 번호의 스테이지가 먼저 오도록 하면 된다 이기 때문
            len -= count;
            num[i] = i + 1;
        }
        
        Arrays.sort(arr);
        //Arrays.sort(arr, Collections.reverseOrder()); -> 사용 불가능 Integer or Double 이렇게 사용해야함 그래서 int [] num 을 만든거임 
         
        boolean [] check = new boolean [N]; // 실패율이 같을때 이미 체크 된건 제외해야해서 
        
        int index = 0 ;
        
        for(int i = N -1; i>=0; i--){ // arr 내림차순이 아니라 N - 1 부터 해주고 
            for(int j = 0 ; j<copy.length; j++){  // 스테이지가 낮은거부터 찾아야해서 
                if(arr[i] == copy[j] && !check[j]){
                    answer[index++] = num[j];
                    check[j] = true;
                    break;
                }
            }
        }
        return answer;
    }
}