package array;

public class Array2 {
    public static void main(String[] args) {
//        int[] students = new int[]{10, 20, 30, 40, 50}; // 배열을 생성과 초기화를 동시에 가능하다.
        int[] students = {10, 20, 30, 40, 50}; // new int[] 생략해도 같은 결과가 나온다.

        for(int i = 0; i < students.length; i++){
            System.out.println("학생" + i + "의 점수 : " + students[i]);
        }
    }
}
