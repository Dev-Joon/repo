package chap_13;

import java.io.*;
import java.util.Scanner;

public class _Quiz_13 {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/chap_13/saying.txt"))){
            bw.write("세살 __ 여든까지 간다");
            bw.newLine();
            bw.write("버릇");
            bw.newLine();
            bw.write("소 잃고 ___ 고친다");
            bw.newLine();
            bw.write("외양간");
            bw.newLine();
            bw.write("천 리 길도 한 __부터");
            bw.newLine();
            bw.write("걸음");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        Scanner sc = new Scanner(System.in);

        try(BufferedReader br = new BufferedReader(new FileReader("src/chap_13/saying.txt"))){
            System.out.println("속담 퀴즈입니다. 빈 칸에 알맞은 말을 입력하시오. (주관식)");
            System.out.println("------------------------------------------------");

            String quiz; // 문제
            String input; // 정답
            String answer; // 사용자 입력

            while(true){
                quiz = br.readLine();
                answer = br.readLine();

                if(quiz == null || answer == null){
                    break;
                }

                System.out.println("(문제) " + quiz);
                System.out.print(" 정답 입력 => ");
                input = sc.next();

                if(answer.equals(input)){
                    System.out.println("정답입니다!!!\n");
                } else {
                    System.out.println("틀렸습니다. 정답은 " + answer + "입니다.\n");
                }
            }

            System.out.println("------------------------------------------------");
            System.out.println("모든 퀴즈가 완료되었습니다.");
            System.out.println("수고하셨습니다. ^^");

        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
