package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 최고값
        long maxIntOver = 2147483648L; //int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue casting=" + intValue); //출력:2147483647

        // 오버플로우 발생 -> 대입값 범위가 초과하여 다시 처음 값으로 출력
        // 오버플로우 자체를 이용하여 로직을 구현하지말고 사이즈를 늘려서 해결 (int -> long)
        intValue = (int) maxIntOver; //형변환
        System.out.println("maxIntOver casting=" + intValue); //출력:-2147483648
    }
}
