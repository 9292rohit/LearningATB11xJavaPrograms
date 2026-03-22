package ex_15_Arrays;

public class Lab097_Arrays {
    public static void main(String[] args) {
        int a = 10;
        int [] marks = {10,20,30,40,50,60,70};
        System.out.println(marks);
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[2]);
        System.out.println(marks[1]);
        System.out.println(marks[6]);
        //System.out.println(marks[10]); // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
        //9System.out.println(marks[-1]); // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException

    }
}
