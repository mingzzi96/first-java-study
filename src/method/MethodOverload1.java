package method;

public class MethodOverload1 {
    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(add(2, 3, 4, 5, 6, 7));
    }

    // 같은 이름의 메서드이지만 파라미터에 따라서 결과값이 다르게 출려됨
    public static int add(int a, int b){
        System.out.println("a + b : ");
        return a + b;
    }

    public static int add(int... numbers){
        // numbers에는 주로 배열이 담기고 크기는 상관이 없다.
        System.out.println("파라미터로 들어온 배열을 다 더함");
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += i;
            System.out.println(sum);
        }
        System.out.println("결과 : ");
        return sum;
    }
}
