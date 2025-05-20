package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("문자열을 입력하세요. : "); // println 줄이 넘어감
        System.out.print("문자열을 입력하세요. : "); // print 한줄에서 처리 가능
        String str = scanner.nextLine(); // 입력을 string으로 가져온다.
        System.out.println("입력한 문자열 : " + str);

        System.out.print("정수를 입력하세요 : ");
        int intVal = scanner.nextInt(); // 입력을 정수로 가져온다.
        System.out.println("입력한 정수 : " + intVal);

        System.out.print("실수를 입력하세요 : ");
        double doubleVal = scanner.nextDouble();
        System.out.println("입력한 실수 : " + doubleVal);
    }
}
