package Programmers;

import java.util.Arrays;
import java.util.Comparator;

//문자열 내림차순으로 배치하기
/*문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.*/
public class DescString {
    public static String solution(String s){
        String[] answer = s.split("");
        return String.join("", Arrays.stream(answer).sorted(Comparator.reverseOrder()).toArray(String[]::new));
        // toArray(String[]::new), 스트림 요소를 문자열 배열로 반환
        // 클래스명 :: 메소드명, () -> new String();

        /*
        만약 Arrays.toString()을 사용하면 배열의 내용을 '[ ]'로 둘러싸이고 쉼표로 구분하는 형태로 출력
        배열 요소들으 보기 좋게 표현하는 방식.
        쉼표없이 이어서 출력하려면, String.join() 메소드를 사용해야함
         */

    }
    public static void main(String[] args) {
        String s = "Zbcdefg";
        System.out.println(solution(s));
    }
}
