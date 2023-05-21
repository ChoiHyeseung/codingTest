package Programmers;

import java.util.Arrays;

public class NumberDivisor {
    public static int[] solution(int[] arr, int divisor) {
        int count = 0;

        // divisor로 나누어 떨어지는 값의 개수를 세기
        for (int num : arr) {
            if (num % divisor == 0)
                count++;
        }

        // divisor로 나누어 떨어지는 값이 없는 경우
        if (count == 0) {
            return new int[]{-1};
        }

        // divisor로 나누어 떨어지는 값을 저장할 배열 생성
        int[] result = new int[count];
        int index = 0;

        // divisor로 나누어 떨어지는 값을 배열에 저장
        for (int num : arr) {
            if (num % divisor == 0) {
                result[index] = num;
                index++;
            }
        }

        // 배열 오름차순으로 정렬
        Arrays.sort(result);

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {55, 9, 7, 10};
        int divisor = 5;

        int[] result = solution(arr, divisor);

        System.out.println(Arrays.toString(result));
    }
}
