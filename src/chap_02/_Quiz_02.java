package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {

        int minHeight = 120;
        int childHeightA = 115;
        int childHeightB = 121;

        String result  = childHeightA > minHeight ? "탑승 가능" : "탑승 불가능";
        System.out.println("키가 " + childHeightA + "cm 이므로 " + result + "합니다");

        result  = childHeightB > minHeight ? "탑승 가능" : "탑승 불가능";
        System.out.println("키가 " + childHeightB + "cm 이므로 " + result + "합니다");
    }
}
