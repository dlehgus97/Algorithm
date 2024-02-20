class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String [] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int [] num = {0,1,2,3,4,5,6,7,8,9};
        
        for(int i = 0 ; i<10; i++){
            if(numbers.contains(word[i])){
                numbers = numbers.replace(word[i],Integer.toString(num[i]));
            }
        }
        answer = Long.parseLong(numbers);
        return answer;
    }
}