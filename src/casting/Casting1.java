package casting;

public class Casting1 {
    public static void main(String[] args) {
        // int < long < double
        // 범위가 작은 타입에서 큰 타입으로 대입 시 자동 허용 (형변환 처리 필요없음) - 자동 형변환

        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int -> long
        System.out.println("longValue = " + longValue); //longValue = 10

        doubleValue = intValue; // int -> double
        System.out.println("doubleValue1 = " + doubleValue); //doubleValue1 = 10.0

        doubleValue = 20L; // long -> double
        System.out.println("doubleValue2 = " + doubleValue); //doubleValue2 = 20.0
    }
}
