package loop;

public class DoWhile2 {
    public static void main(String[] args) {
        int i = 10;

        // 최초 한번은 무조건 실행
        do {
            System.out.println("현재 숫자는 : " + i);
            i++;
        } while (i < 3);
    }
}
