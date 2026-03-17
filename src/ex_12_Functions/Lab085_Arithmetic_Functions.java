package ex_12_Functions;

import java.util.Scanner;

public class Lab085_Arithmetic_Functions {
    public static void main(String[] args) {
        // Create a Function of sub, sum, Mul, Div
        // with parameter a,b (take the parameter from user)

        // Logic Building
        // Step 1 -> Inputs and Outputs
        // a, b - int -> Scanner
        // int -> Variable result ->

        // Step 2 - Rough logic -> Create functions
        // function -> type 4th - with return and with arguments/parametrs

        // Step 3 - Write the code and Find and fix the edge cases

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num1");

        int a=0;
        if (scanner.hasNextInt()){
            a = scanner.nextInt();
        }else {
            System.out.println("Enter the Int only");
            System.exit(0);
        }

        System.out.println("Enter the num2");
        int b = scanner.nextInt();

        int result_sum = sum_of_2_nos(a,b);
        int result_sub = sub_of_2_nos(a,b);
        int result_div = div_of_2_nos(a,b);
        int result_mul = mul_of_2_nos(a,b);
        int result_mod = mod_of_2_nos(a,b);

        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_div);
        System.out.println(result_mul);
        System.out.println(result_mod);

    }

    static int sum_of_2_nos(int a, int b){
        return a+b;
    }

    static int sub_of_2_nos(int a, int b){
        return a-b;
    }

    static int div_of_2_nos(int a, int b){
        if (b==0){
            System.out.println("Div by 0 is not allowed");
            System.exit(0);
        }
        return a/b;
    }

    static int mul_of_2_nos(int a, int b){
        return a*b;
    }

    static int mod_of_2_nos(int a, int b){
        return a%b;
    }

}
