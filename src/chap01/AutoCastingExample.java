package chap01;

public class AutoCastingExample {
    public static void main(String[] args) throws Exception {
        byte byteValue1 = 10;
        byte byteValue2 = 20;
        // byte byteValue3 = byteValue1 + byteValue2;
        // System.out.println(byteValue3);

        byte byteValue3 = 10;
        double doubleValue = byteValue3;
        System.out.println(doubleValue);

        // Cannot complie when the type of value is smaller than the big type
        // Like type `byte` value cannot get the `double` value.
    }
}
