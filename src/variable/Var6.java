package variable;

public class Var6 {
    public static void main(String[] args) {
        /**
         * 변수 초기화 없이 실행 시
         * java: variable a might not have been initialized
         * 에러 발생 이유 : 변수 선언 시 메모리 상에 공간을 차지하고 사용하게 됨. 그런데 그 공간에 기존에 어떤 값이 있었는지 모름.
         * 그러므로 초기화하지 않으면 이상한 값이 출력될 수 있으므로 초기화를 강제함.
         */

        int a; // 지역변수는 초기화 필수
        // System.out.println(a);
    }
}
