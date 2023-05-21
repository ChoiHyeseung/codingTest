package Programmers;

public class Absolutes_boolean_answer {
    public static int solution(int[] absolutes, boolean[] signs){
        int answer = 0;
        for (int i=0; i<signs.length; i++)
            answer += absolutes[i] * (signs[i]? 1: -1);
        //signs[i]가 true면 1을 곱하고, false면 -1을 곱함
        return answer;
    }
    public static void main(String[] args) {
        int[] absolutes = {1,2,3};
        boolean[] sign = {false,false,true};
        System.out.println(solution(absolutes,sign));
    }
}
