package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int sum = a + b;
        System.out.println("a + b = " + sum);

        int diff = a - b;
        System.out.println("a - b = " + diff);

        int div = a / b; // int 타입은 소수점 표현이 되지 않음
        System.out.println("a / b = " + div);

        int mod = a % b; // 나머지 계산
        System.out.println("a % b = " + mod);
    }
}
