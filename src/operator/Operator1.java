package operator;

public class Operator1 {
    public static void main(String[] args) {
        // 변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum);

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나눗셈
        int div = a / b;
        System.out.println("a / b = " + div); // 실제 값은 2.5 이지만 int 타입끼리의 계산이므로 결과도 int 타입으로 나옴 (2로 출력)

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod);
    }
}
