package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        /**
         * 비효율적 메모리 사용 : temp는 if문에서만 필요. if문 내에서 선언하면 더 효율적인 메모리 사용 가능
         * 코드 복잡성 증가 : if문 끝나도 temp에 접근 가능. (scope 범위가 너무 넓음)
         */

        int m = 10;
        int temp = 0;
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
