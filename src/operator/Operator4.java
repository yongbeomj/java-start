package operator;

public class Operator4 {
    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3;
        int sum4 = (2 * 2) + (3 * 3);
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);

        // 연산자 우선순위가 애매해지거나 약간이라도 복잡해지면 괄호 추가하는 것을 권장
        // 괄호 여부와 상관없이 결과 값은 동일하나 가독성이 좋으므로 유지보수 하기 좋음
    }
}
