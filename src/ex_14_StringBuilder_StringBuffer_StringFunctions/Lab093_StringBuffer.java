package ex_14_StringBuilder_StringBuffer_StringFunctions;

public class Lab093_StringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Rohit");
        stringBuffer.append("Patil");
        System.out.println(stringBuffer);
//        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuffer.append("Peth"));

        String s1 = "Hello";
        String s2 = " World!";
        String s3 = s1+s2;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);




    }
}
