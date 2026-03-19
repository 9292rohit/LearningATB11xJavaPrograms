package ex_13_Strings;

import java.util.Locale;

public class Lab089_String_Functions {
    public static void main(String[] args){
        char c = 'A';
        System.out.println(c);
        int a =10;
        int b =10;
        String d = "A";
        String e = new String("A");
        String f = new String("a");



        String s1 = "ABcD";
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.concat("E"));
        System.out.println(a==b);
        System.out.println(e==d);
        System.out.println(d.equals(e));
        System.out.println(e.equals(f));
        System.out.println(e.equalsIgnoreCase(f));
    }
}
