package Programmers;
//가운데 글자 가져오기

/*단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.*/
public class MidWord {
    public static String solution(String s){
        String[] arr = s.split(""); //매개변수를 문자별로 나눠 배열에 저장
        if(s.length() % 2 == 0){ //만약 길이가 짝수라면
            return arr[arr.length/2 -1] + arr[arr.length/2]; //배열의 가운데 두 요소 반환
        }
        return arr[arr.length/2]; //홀수라면 가운데 문자 반환
    }
    public static void main(String[] args) {
        String s = "abcde";
        String s2 = "qwerty";
        System.out.println(solution(s));
        System.out.println(solution(s2));
    }
}
