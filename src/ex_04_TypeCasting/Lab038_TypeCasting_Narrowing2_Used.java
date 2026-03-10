package ex_04_TypeCasting;

public class Lab038_TypeCasting_Narrowing2_Used {

    public static void main (String [] args) {
        int course = 100;
        float Gst = 18.45f;
//        int total = course + Gst; Narrow - implicit
//        System.out.println(total);
        int total1 = course + (int) Gst; //Narrow - Explicit
        System.out.println(total1);

        float total2 = course + Gst; // Widening - auto - implicit
        System.out.println(total2);

        float total3 = (float) course + Gst; // Widening - explicit
        System.out.println(total3);
    }

}
