package Programmers;
//문자열 다루기 기본
//다른 사람 풀이
public class StringBasic_Exception {
    public static boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6){
            try{
                int x = Integer.parseInt(s); //string을 int로 변환
                return true;
            } catch(NumberFormatException e){ //문자열을 숫자로 변활할 때 숫자가 아니라면 예외 발생
                return false; //false 리턴
            }
        }
          else return false;
    }

    public static void main(String[] args) {
        String s1 = "a234";
        String s2 = "1234";
        System.out.println(solution(s1));
        System.out.println(solution(s2));
    }
}
