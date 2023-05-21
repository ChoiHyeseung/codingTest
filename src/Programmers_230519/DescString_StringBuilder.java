package Programmers_230519;

import java.util.Arrays;

//문자열 내림차순으로 배치하기
//다른 사람 풀이
public class DescString_StringBuilder {
    public static String reverseStr(String str){
        String[] sol = str.split(""); //String을 char배열로 바꾸기
        Arrays.sort(sol);//배열 정렬
        String s = String.join("",sol);
        return new StringBuilder(s).reverse().toString(); //내림차순이기 때문에 반전하면됨
        //StringBuilder 생성자의 매개변수는 String, someCharSequence

        /* char 배열로 해도됨
        char[] sol = str.toCharArray();
        Arrays.sort(sol);
        return new StringBuilder(new String(sol)).reverse().toString();

        참고 : new String(charArray, startIndex, length);*/
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        String s = "Zbcdefg";
        System.out.println( reverseStr(s));
    }
}