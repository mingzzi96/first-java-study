package method;

public class Method1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(add(a, b));


        int x = 10;
        int y = 20;
        System.out.println(add(x, y));
    }
    // add 메서드
    public static int add(int a, int b){
        System.out.println(a + "+" + b + " 연산 수행");

        int result = a + b;
        return result;
    }
}
