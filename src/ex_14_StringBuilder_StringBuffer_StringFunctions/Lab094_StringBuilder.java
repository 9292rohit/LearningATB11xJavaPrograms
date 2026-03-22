package ex_14_StringBuilder_StringBuffer_StringFunctions;

public class Lab094_StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Rohit");
        stringBuilder.append(" Patil");

        System.out.println(stringBuilder);
        System.out.println(stringBuilder.reverse());

        stringBuilder.delete(3,7);
        System.out.println(stringBuilder);

        stringBuilder.replace(0,5, "Only");
        System.out.println(stringBuilder);



    }
}
