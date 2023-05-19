package Programmers_230519;

import java.util.Arrays;

/*프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
전화번호가 문자열 phone_number로 주어졌을 때,
전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
phone_number는 길이 4 이상, 20이하인 문자열입니다.*/
public class PhoneNumber {
    public static String solution(String phone_number) {
        char[] digits = phone_number.toCharArray();
        for (int i = 0; i < digits.length - 4; i++) {
            digits[i] = '*';
        }
        return String.valueOf(digits);
        // 그냥 digits.toString()을 하면 배열의 식별자를 문자열로 반환하여 원하는 결과를 얻을 수 없음
        /* char배열을 문자열로 반환하려면,
        String.valueOsf(digits);
        new String(digits); 를 사용해야함
         */
        // String 배열을 문자열로 변환하려면 String.join(구분자, 배열);
    }

    public static void main(String[] args) {
        String phone_number = "123424242";
        System.out.println(solution(phone_number));
    }
}

