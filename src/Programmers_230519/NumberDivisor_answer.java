package Programmers_230519;

import java.util.Arrays;

// 나누어 떨어지는 숫자 배열  다른 사람 코드
class NumberDivisor_answer {
    public static int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
        //Arrays.stream(arr)로 배열을 스트림으로 변환
        //filter함수를 사용하여 스트림 요소들 중 divisor과 나눠지는 수를 리턴
        //toArray() 스트림을 배열로 변환

        if (answer.length == 0) answer = new int[]{-1}; //나눠지는 수가 없다면 -1 요소를 가진 배열 생성
        Arrays.sort(answer); //Arrays 정렬
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {55, 9, 7, 10};
        int divisor = 5;

        int[] result = solution(arr, divisor);

        System.out.println(Arrays.toString(result));
    }
}