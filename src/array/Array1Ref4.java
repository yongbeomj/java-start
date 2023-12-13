package array;

public class Array1Ref4 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};

        /* 단 분리하면 안됨
        int[] students;
        students = {90, 80, 70, 60, 50}; // 해당 라인만 봤을 때 students 변수가 배열변수인지 알 수 없음
        */

        //변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
