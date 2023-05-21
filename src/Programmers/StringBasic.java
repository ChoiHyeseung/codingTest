package Programmers;
//문자열 다루기 기본

/*문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.*/

public class StringBasic {
    public static boolean solution(String s) {
        boolean answer = true;
        int length = s.length();

        if (length == 4 || length == 6) {
            for (int i = 0; i < length; i++) {
                char c = s.charAt(i); //String 한문자를 char로 변환
                if (!Character.isDigit(c)) { //그 문자가 숫자가 아니라면
                    answer = false; //false 리턴
                    break;
                }
            }
        } else {
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        String s1 = "a234";
        String s2 = "1234";
        System.out.println(solution(s1));
        System.out.println(solution(s2));

    }
}
