package ex_13_Strings;

public class Lab092_StringBuilder_vs_StringBuffer {

    public static void main (String[] args){

        String s0 = "Rohit";
        String s1 = new String("Patil");

        StringBuilder stringBuilder = new StringBuilder("Rohit");
        StringBuffer stringBuffer = new StringBuffer("Patil");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer);


    }
}
