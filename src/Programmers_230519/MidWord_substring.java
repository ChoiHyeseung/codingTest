package Programmers_230519;
//가운데 글자 가져오기
//다른 사람 풀이

/*단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.*/
public class MidWord_substring {
    public static String solution(String s){
        //문자열 자르기 : substring(첫 인덱스, 마지막 인덱스) 마지막 인덱스는 포함X
        return s.substring((s.length()-1)/2, s.length()/2 + 1);
    }
    public static void main(String[] args) {
        String s = "abcde"; //substring(2,3)
        String s2 = "qwerty";//substring(2,4);
        System.out.println(solution(s));
        System.out.println(solution(s2));
    }
}
