package operator;

public class Comp1 {
    public static void main(String[] args) {
        String str1 = "문자열1";
        String str2 = "문자열2";

        System.out.println(str1.equals(str2)); // false
        boolean result = str1.equals(str2);
        System.out.println("result: " + result);
    }
}
