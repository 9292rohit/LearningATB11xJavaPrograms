package ex_03_Operators;

public class Lab022_Unary_Operators {

    public static void main(String[] args) {
        int a = +10;
        int b = -110;
        int result = a+b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(a+b);
        System.out.println(result);

        int c = -1;
        int d = +1;


        System.out.println(c+d);
        System.out.println(c-d);

        d = d-1;
        System.out.println(d);
    }
}
