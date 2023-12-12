package loop;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        // i가 반복문 증감 변수인지 확인이 어려움
        for (; ; ) {
            sum = sum + i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;
            }
            i++;
        }
    }
}
