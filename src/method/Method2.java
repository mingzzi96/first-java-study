package method;

public class Method2 {
    // void는 반환값이 없는 메서드에 사용한다.
    public static void main(String[] args) {
        printHeader();
        System.out.println("= 프로그램이 동작합니다. =");
        printFooter();
    }

    public static void printHeader(){
        System.out.println("= 프로그램을 시작합니다. =");
        return;
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다. =");
        return;
    }
}
