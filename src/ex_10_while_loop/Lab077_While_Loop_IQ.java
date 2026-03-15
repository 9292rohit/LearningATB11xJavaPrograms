package ex_10_while_loop;

import java.util.Scanner;

public class Lab077_While_Loop_IQ {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();

        int factorial = 1;
        if (number <= 0) {
            System.out.println(factorial);
        }else {

            for (int i = 1; i <= number; i++) {
                    factorial = factorial * i;

        }}
        System.out.println("Factorial is ->" + factorial);
        }

    }

