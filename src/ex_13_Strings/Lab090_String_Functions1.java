package ex_13_Strings;

public class Lab090_String_Functions1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println(str1==str2);
        System.out.println(str2==str3);
        System.out.println(str1.equals(str3));
        System.out.println(str1.length());
        System.out.println(str1.charAt(2));
        System.out.println(str1.concat(" World"));
        System.out.println(str1.contains("el"));
        System.out.println(str1.contains("Ho"));
        System.out.println(str1.equals("Hello"));
        System.out.println(str1.equalsIgnoreCase("heLlO"));
        System.out.println(str1.indexOf("o"));
        System.out.println(str1.indexOf("l"));
        System.out.println(str2.replace('H','p'));

        String email = "9292rohit@gmail.com@1234";
        String[] split = email.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        System.out.println(email.substring(0,2));
        System.out.println(email.startsWith("9"));
        System.out.println(email.endsWith("34"));


        String name= "   Rohit Patil   ";
        System.out.println(name.trim());

        System.out.println(str1);
        System.out.println(str1.compareTo("hello"));


        System.out.println(str1.lastIndexOf("l"));
    }
}
