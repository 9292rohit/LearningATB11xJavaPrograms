package ex_12_Functions;

public class Lab084_User_Defined_Functions1 {
    public static void main(String[] args) {
        wp_wr_greet();

        String result1 = wp_r_greet();
        System.out.println(result1);

        p_wr_greet_with_details("Rohit", 34, 9.34);
        full_name("Rohit", "Patil");

        int s2 = sum_of_2_nos(2,3);
        System.out.println(s2);

        int s3 = sum_of_3_nos(3,4,5);
        System.out.println(s3);
    }

    //    1. without parameters and without Return type
    static void wp_wr_greet() {
        System.out.println("Hi, how are you?");
    }

    //    2. without parameters but with Return type
    static String wp_r_greet() {
        System.out.println("Hi");
        return "I am good";
    }

    //    3. with parameters and without Return type
    static void p_wr_greet_with_details(String name, int age, double salary) {
        System.out.println("Your name is ->" + name + "\nYour age is " + age + "\nYour salary is " + salary);
    }

    static void full_name(String f_name, String L_name){
        System.out.println("Your full name is ->" + f_name +" "+ L_name );
    }

    //    4. with parameters and with Return type
    static int sum_of_2_nos(int a, int b){
        return a+b;

    }
    static int sum_of_3_nos(int a, int b, int c){
        return a+b+c;

    }




}


