import java.sql.SQLOutput;

public class VariablesTest {
    public static void main(String[] args) {
        float floatVar = 1.2f;
        System.out.println(floatVar + 0.0); // 1.2000000476837158

        double doubleVar = 2;
        System.out.println(doubleVar % 1.9); // 0.10000000000000009

        char charVar = 'a';
        System.out.println(charVar); // a
        System.out.println(charVar + 1); // 98

        int intMin = Integer.MIN_VALUE;
        int intMax = Integer.MAX_VALUE;
        System.out.println("IntMax + 1 == " + ++intMax); // == intMin
        System.out.println("IntMin - 1 == " + --intMin); // == intMax

        byte byteVar = 127;
        short shortVar = 1;
        System.out.println(byteVar + shortVar); // 128
        System.out.println((byte) (byteVar + shortVar)); // -128

        System.out.println("max long == " + Long.MAX_VALUE); // 9223372036854775807

        boolean booleanVar = 1 == 1 ? true : false;
        System.out.println(booleanVar); // true
        boolean booleanVar2 = 1 == 2 ? true : false;
        System.out.println(booleanVar2); // false

        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1.equals(s2)); // true
        System.out.println(!s1.equals(s2)); // false
    }
}
