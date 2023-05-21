package Programmers;

/*
길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
*/
public class Pattern {
    public static String solution(int n) {
        String su = "수";
        String bak = "박";
        String s = "";

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                s += su;
            } else {
                s += bak;
            }
        }
        /* 삼항연산자 사용
        for(int i=0;i<n;i++) {
        result +=(i%2==0)? "수":"박";}
        */

        return s;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(solution(3));
    }
}
