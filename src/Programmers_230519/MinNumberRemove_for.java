package Programmers_230519;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinNumberRemove_for {
    public static int[] solution(int[] arr) {
        int[] answer = {};

        if (arr.length == 1) {
            answer = new int[]{-1};
        } else {
            //ArrayList 생성
            List<Integer> list = new ArrayList<>();

            //list에 배열 요소 삽입
            for (int a : arr)
                list.add(a);
            // 최소값 삭제
            list.remove(Collections.min(list));
            answer = new int[arr.length - 1];
            for (int i = 0; i < list.size(); i++)
                answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        System.out.println(Arrays.toString(solution(arr)));
    }
}

