package Tasks;

import java.util.Scanner;

public class Lab051_task_CLI_User_Input_Max_value_Pramod {
    public static void main(String args[]){

//        System.out.println("Enter name, age and salary");
//        String name = args[0];
//        int age = Integer.parseInt(args[1]);
//        double salary = Double.parseDouble(args[2]);
//
//        System.out.println(name);
//        System.out.println(age);
//        System.out.println(salary);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name1 = scanner.nextLine();

        System.out.println("Enter your age");
        int age1 = scanner.nextInt();

        System.out.println("Enter your salary");
        double salary1 = scanner.nextDouble();

        scanner.close();

    }
}
