import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        left.add(3);
        left.add(0);
        right.add(3);
        right.add(2);

        for (int i = 0; i < numbers.length; i++) {
            int tmp1 = 0;
            int tmp2 = 0;

            if (numbers[i] == 1) {
                tmp1 = 0;
                tmp2 = 0;
                left.clear();
                left.add(tmp1);
                left.add(tmp2);
                answer += "L";
            } else if (numbers[i] == 2) {
                tmp1 = 0;
                tmp2 = 1;
                int rightDis = Math.abs(tmp1 - right.get(0)) + Math.abs(tmp2 - right.get(1));
                int leftDis = Math.abs(tmp1 - left.get(0)) + Math.abs(tmp2 - left.get(1));
                if (leftDis > rightDis) {
                    right.clear();
                    right.add(tmp1);
                    right.add(tmp2);
                    answer += "R";
                } else if (leftDis < rightDis) {
                    left.clear();
                    left.add(tmp1);
                    left.add(tmp2);
                    answer += "L";
                } else {
                    if (hand.equals("right")) {
                        right.clear();
                        right.add(tmp1);
                        right.add(tmp2);
                        answer += "R";
                    } else {
                        left.clear();
                        left.add(tmp1);
                        left.add(tmp2);
                        answer += "L";
                    }
                }
            }
            else if (numbers[i] == 3) {
                    tmp1 = 0;
                    tmp2 = 2;
                    right.clear();
                    right.add(tmp1);
                    right.add(tmp2);
                    answer += "R";
                } else if (numbers[i] == 4) {
                    tmp1 = 1;
                    tmp2 = 0;
                    left.clear();
                    left.add(tmp1);
                    left.add(tmp2);
                    answer += "L";
                } else if (numbers[i] == 5) {
                    tmp1 = 1;
                    tmp2 = 1;
                    int rightDis = Math.abs(tmp1 - right.get(0)) + Math.abs(tmp2 - right.get(1));
                    int leftDis = Math.abs(tmp1 - left.get(0)) + Math.abs(tmp2 - left.get(1));
                    if (leftDis > rightDis) {
                        right.clear();
                        right.add(tmp1);
                        right.add(tmp2);
                        answer += "R";
                    } else if (leftDis < rightDis) {
                        left.clear();
                        left.add(tmp1);
                        left.add(tmp2);
                        answer += "L";
                    } else {
                        if (hand.equals("right")) {
                            right.clear();
                            right.add(tmp1);
                            right.add(tmp2);
                            answer += "R";
                        } else {
                            left.clear();
                            left.add(tmp1);
                            left.add(tmp2);
                            answer += "L";
                        }
                    }
            }
            else if (numbers[i] == 6) {
                        tmp1 = 1;
                        tmp2 = 2;
                        right.clear();
                        right.add(tmp1);
                        right.add(tmp2);
                        answer += "R";
                    } else if (numbers[i] == 7) {
                        tmp1 = 2;
                        tmp2 = 0;
                        left.clear();
                        left.add(tmp1);
                        left.add(tmp2);
                        answer += "L";
                    } else if (numbers[i] == 8) {
                        tmp1 = 2;
                        tmp2 = 1;
                        int rightDis = Math.abs(tmp1 - right.get(0)) + Math.abs(tmp2 - right.get(1));
                        int leftDis = Math.abs(tmp1 - left.get(0)) + Math.abs(tmp2 - left.get(1));
                        if (leftDis > rightDis) {
                            right.clear();
                            right.add(tmp1);
                            right.add(tmp2);
                            answer += "R";
                        } else if (leftDis < rightDis) {
                            left.clear();
                            left.add(tmp1);
                            left.add(tmp2);
                            answer += "L";
                        } else {
                            if (hand.equals("right")) {
                                right.clear();
                                right.add(tmp1);
                                right.add(tmp2);
                                answer += "R";
                            } else {
                                left.clear();
                                left.add(tmp1);
                                left.add(tmp2);
                                answer += "L";
                            }
                        }
            }
            else if (numbers[i] == 9) {
                            tmp1 = 2;
                            tmp2 = 2;
                            right.clear();
                            right.add(tmp1);
                            right.add(tmp2);
                            answer += "R";
                        } else if (numbers[i] == 0) {
                            tmp1 = 3;
                            tmp2 = 1;
                            int rightDis = Math.abs(tmp1 - right.get(0)) + Math.abs(tmp2 - right.get(1));
                            int leftDis = Math.abs(tmp1 - left.get(0)) + Math.abs(tmp2 - left.get(1));
                            if (leftDis > rightDis) {
                                right.clear();
                                right.add(tmp1);
                                right.add(tmp2);
                                answer += "R";
                            } else if (leftDis < rightDis) {
                                left.clear();
                                left.add(tmp1);
                                left.add(tmp2);
                                answer += "L";
                            } else {
                                if (hand.equals("right")) {
                                    right.clear();
                                    right.add(tmp1);
                                    right.add(tmp2);
                                    answer += "R";
                                } else {
                                    left.clear();
                                    left.add(tmp1);
                                    left.add(tmp2);
                                    answer += "L";
                                }
                            }


                        }
                
            
                    }
        return answer;
                }
}