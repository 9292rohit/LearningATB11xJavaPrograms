package ex_12_Functions;

public class Lab082_Simple_Functions {
    public static void main(String[] args) {

        rohit_f1();
        int result = return_f2();
        System.out.println(result);

        boolean result2 = return_f3();
        System.out.println(return_f3());

        float result3 = return_pi();
        System.out.println(return_pi());

        byte result4 = return_byte();
        System.out.println(return_byte());

        long result5 = return_long();
        System.out.println(return_long());

        String result6 = return_string();
        System.out.println(return_string());


    }

    //    static returnDatatype (Void, anyother datatype)
//        void - no return
    static void rohit_f1() {

        System.out.println("No return");
    }

    static int return_f2() {
        return 10;
    }

    static boolean return_f3() {

        return true;
    }
    static float return_pi(){

        return 3.14f;
    }
    static byte return_byte(){

        return 100;
    }
    static long return_long(){

        return 10l;
    }
    static String return_string(){

        return "Rohit";
    }
}
