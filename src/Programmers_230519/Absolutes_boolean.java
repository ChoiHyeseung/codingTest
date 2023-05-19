package Programmers_230519;

public class Absolutes_boolean {
    public static int solution(int[] absolutes, boolean[] signs){
        int sum = 0;

        for(int i = 0; i < absolutes.length; i++){
            if(signs[i]){
                sum += absolutes[i];
            }
            else sum-= absolutes[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] absolutes = {1,2,3};
        boolean[] sign = {false,false,true};
        System.out.println(solution(absolutes,sign));
    }
}
