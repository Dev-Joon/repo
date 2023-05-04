package chap_03;

import java.sql.SQLOutput;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); // 문자열 내용이 같으면 true, 다르면 false

        // 대소문자 구분 없이 문자열 내용이 같은지 여부 체크
        System.out.println(s2.equalsIgnoreCase("python"));

        // 문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true (내용)
        System.out.println(s1 == s2); // true (참조)

        // s1과 s2는 각각 다른 메모리에 저장
        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true (내용이 같으므로)
        System.out.println(s1 == s2); // false (참조가 다르므로)
    }
}
