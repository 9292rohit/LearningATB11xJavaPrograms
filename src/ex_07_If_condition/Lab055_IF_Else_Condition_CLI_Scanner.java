package ex_07_If_condition;

import java.util.Scanner;

public class Lab055_IF_Else_Condition_CLI_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age!");
        int age = scanner.nextInt();
        System.out.println(age);

        if (age > 18) {
            System.out.println("Yes, you are allowed to vote!");

        } else {
            System.out.println("No, you are not allowed to vote");

        }
    }
}
