package Programmers_230519;
//없는 숫자 더하기
//다른 사람 풀이

import java.util.Arrays;

public class NoneNumberSum_answer {
    public static int solution(int[] numbers) {
        return 45 - Arrays.stream(numbers).sum();
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
        int[] numbers2 = {5, 8, 4, 0, 6, 7, 9,};
        System.out.println(solution(numbers));
        System.out.println(solution(numbers2));
    }
}
