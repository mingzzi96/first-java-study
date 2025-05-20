package array;

public class Array1 {
    public static void main(String[] args) {
        int[] students;
        students = new int[7]; // int가 7개 있다는 뜻

        students[0] = 80;
        students[1] = 100;
        students[2] = 10;
        students[3] = 80;
        students[4] = 60;
        students[5] = 100;
        students[6] = 80;

        for(int i = 0; i < students.length; i++){
            System.out.println("학생" + i + "의 점수 : " + students[i]);
        }

    }
}
