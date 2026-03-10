package ex_04_TypeCasting;

public class Lab036_TypeCasting_Narrowing {
    public static void main (String [] args) {
        int val = 200;
//        byte b = val; Invalid - Narrowing - Implicit casting is not allowed
        byte b = (byte)val; // Valid - Narrowing - Explicit casting is allowed
//Data loss
        System.out.println(b);

    }
}
