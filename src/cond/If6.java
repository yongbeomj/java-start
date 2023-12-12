package cond;

public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }

        System.out.println("총 할인 금액: " + discount + "원");

        if (true) {
            System.out.println("if문 실행");
        }

        // if문 코드 범위 확인 및 가독성을 위해 중괄호를 사용하는 것을 권장
        if (false)
            System.out.println("if문 실행"); // if문
            System.out.println("if문 실행안됨"); // main 메서드 (if문과 무관)
    }
}
