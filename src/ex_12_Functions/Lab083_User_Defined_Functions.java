package ex_12_Functions;

public class Lab083_User_Defined_Functions {
    public static void main(String[] args) {
        int result1 = sum_of_two_number(3,4);
        int result2 = sum_of_two_number(13,14);
        System.out.println(result1);
        System.out.println(result2);

    }
    static int sum_of_two_number(int a, int b) {
        return a + b;
    }
}
