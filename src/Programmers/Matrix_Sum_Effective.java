package Programmers;

import java.util.Arrays;
//행렬의 덧셈
//다른 사람 풀이
public class Matrix_Sum_Effective {
        public static int[][] solution(int[][] arr1, int[][] arr2) {
            int[][] answer = {};
            answer = arr1; //answer 크기와 arr1의 크기가 같으므로 arr1을 대입해도됨
            for(int i=0; i<arr1.length; i++){
                for(int j=0; j<arr1[0].length; j++){
                    answer[i][j] += arr2[i][j]; //이미 arr1을 대입했으므로 arr2를 더하면됨
                }
            }
            return answer;
        }

        public static void main(String[] args) {
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};
        int[][] answer = solution(arr1, arr2);

        System.out.println(Arrays.deepToString(answer)); //깊은복사하기
//      다차원 배열의 요소를 재귀적으로 탐색하여 각 요소를 문자열로 변환
    }
    }

