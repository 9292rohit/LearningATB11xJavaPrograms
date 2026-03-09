package ex_03_Operators;

public class Lab031_All_Operators {
    public static void main(String[] args) {
//        arithmetic operators
        boolean b1 = true;
        int a = 10;
        int b = 20;
        System.out.println( a + b );
        System.out.println( a > b );
        System.out.println( a >= b );
        System.out.println( a == b );
        System.out.println( a != b );

//        compound assignment operators -> +=, -=, *=, /=
        int age = 10;
        age += 10;
        System.out.println(age);

        int age1 = 20;
        age1 -= 10;
        System.out.println(age1);

        int age2 = 20;
        age2 *= 10;
        System.out.println(age2);

        int age3 = 20;
        age3 /= 10;
        System.out.println(age3);

    }
}
