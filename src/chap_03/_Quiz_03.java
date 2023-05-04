package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        // "901231-1234567" 인 경우 901231-1까지 출력
        // "030708-4567890" 인 경우 030708-4까지 출력

        String ID = "901231-1234567";
        System.out.println(ID.substring(0, 8));
        System.out.println(ID.substring(0, ID.indexOf("-") + 2));

        ID = "030708-4567890";
        System.out.println(ID.substring(0, 8));
        System.out.println(ID.substring(0, ID.indexOf("-") + 2));
    }
}
