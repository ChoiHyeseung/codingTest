package Programmers;
//제일 작은 수 제거하기
/*정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.*/

import java.util.Arrays;
// stream 활용
// 스트림은 시간이 for문보다 오래걸림...
public class MinNumberRemove {
    public static int[] solution(int[] arr) {
        if (arr.length <= 1) { //배열의 길이가 1보다 작다면
            return new int[]{-1}; // -1 배열 리턴
        }

        //스트림으로 변환한 후 최소값을 구하고 그 수를 정수형으로 저장
        int min = Arrays.stream(arr).min().getAsInt();
        //최소값이 아닌 수들을 스트림에 저장한 후 배열로 반환
        return Arrays.stream(arr).filter(i -> i != min).toArray();
        //
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        int[] result = solution(arr);
        System.out.println(Arrays.toString(result));
    }
}
